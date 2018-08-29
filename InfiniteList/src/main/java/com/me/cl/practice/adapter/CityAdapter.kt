package com.me.cl.practice.adapter

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.me.cl.practice.CityModel
import com.me.cl.practice.R
import com.me.cl.practice.databinding.ItemListBinding

/**
 * Created by CL on 8/28/18.
 */
class CityAdapter(val cityList: List<CityModel>?) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return MyViewHolder(DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_list, parent, false))
    }

    override fun getItemCount(): Int {
        return cityList?.size ?: 0
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val city = cityList?.get(position)
            city?.let {
                (holder.dataBinding as? ItemListBinding)?.apply {
                    cityModel=city
                }
            }
        }
    }
}


class MyViewHolder(val dataBinding: ViewDataBinding) : RecyclerView.ViewHolder(dataBinding.root)