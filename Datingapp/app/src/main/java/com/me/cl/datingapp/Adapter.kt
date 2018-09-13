package com.me.cl.datingapp

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

/**
 * Created by CL on 9/12/18.
 */
class Adapter(var dataList:List<Date.DataBean>):RecyclerView.Adapter<BindingViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BindingViewHolder {
        return DataBindingUtil.inflate<>(parent.context,R.layout.item_date,parent,false)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: BindingViewHolder, position: Int) {
        holder.
    }
}

class BindingViewHolder(var viewDataBinding: ViewDataBinding):RecyclerView.ViewHolder(viewDataBinding.root)