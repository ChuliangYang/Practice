package com.me.cl.datingapp

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.me.cl.datingapp.databinding.ItemDateBinding
import kotlinx.android.synthetic.main.item_date.view.*

/**
 * Created by CL on 9/12/18.
 */
class Adapter(var dataList:List<Date.DataBean>):RecyclerView.Adapter<BindingViewHolder<ItemDateBinding>>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BindingViewHolder<ItemDateBinding> {
        return BindingViewHolder(DataBindingUtil.inflate(LayoutInflater.from(parent.context),R.layout.item_date,parent,false))
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: BindingViewHolder<ItemDateBinding>, position: Int) {
        holder.viewDataBinding.dataBean=dataList[position]
        holder.viewDataBinding.root.apply {
            Glide.with(context).load(dataList[position].photo.thumb_paths).into(iv_photo)
        }
    }
}

class BindingViewHolder<T:ViewDataBinding>(var viewDataBinding: T):RecyclerView.ViewHolder(viewDataBinding.root)