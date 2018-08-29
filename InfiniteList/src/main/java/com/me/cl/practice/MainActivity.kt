package com.me.cl.practice

import android.os.Bundle
import android.support.v4.view.PagerAdapter
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.me.cl.practice.adapter.CityAdapter
import com.me.cl.practice.api.CityService
import com.trello.rxlifecycle2.components.support.RxAppCompatActivity
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.infinite_recyclerview.view.*

class MainActivity : RxAppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val cityService=RetrofitClient.getInstance().create(CityService::class.java)
        vp_list.apply {
            adapter = object : PagerAdapter() {
                override fun instantiateItem(container: ViewGroup, position: Int): Any {
                    return LayoutInflater.from(this@MainActivity).inflate(R.layout.infinite_recyclerview,container,false).also{
                    }.apply {
                        val cityList:MutableList<CityModel> = mutableListOf()
                        val mAdapter=CityAdapter(cityList)
                        var page=0
                        container.addView(this)

                        sf_list.apply {
                            setOnRefreshListener {
                                cityService.getCityList().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).compose (bindToLifecycle()).subscribe {
                                    cityList.apply {
                                        clear()
                                        addAll(it)
                                    }
                                    page=0
                                    mAdapter.notifyDataSetChanged()
                                    isRefreshing=false
                                }
                            }
                        }

                        jrv_list.apply {
                            adapter=mAdapter
                            layoutManager=LinearLayoutManager(this@MainActivity)
                            setLoadingMoreListener {
                                cityService.getCityList(++page).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).compose (bindToLifecycle()).subscribe {
                                    cityList.apply {
                                        addAll(it)
                                    }
                                    mAdapter.notifyDataSetChanged()
                                    loadMoreComplete()
                                }
                            }
                            cityService.getCityList().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).compose (bindToLifecycle()).subscribe {
                                cityList.apply {
                                    addAll(it)
                                }
                                page=0
                                mAdapter.notifyDataSetChanged()
                            }
                        }

                    }
                }

                override fun getPageTitle(position: Int): CharSequence? {
                    return when(position){
                        0->"test1"
                        else->"test2"
                    }
                }

                override fun isViewFromObject(view: View, `object`: Any): Boolean {
                    return view==`object`
                }

                override fun getCount(): Int {
                    return 2
                }

            }

            currentItem = 0
        }

        tl_list.setupWithViewPager(vp_list)

    }

}
