package com.example.players

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.players.databinding.ManagersBinding

class ManagerAdapter:  ListAdapter<Manager, ManagerAdapter.ManagerViewHolder>(DiffCallBack){

    companion object DiffCallBack: DiffUtil.ItemCallback<Manager>(){
        override fun areItemsTheSame(oldItem: Manager, newItem: Manager): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: Manager, newItem: Manager): Boolean {
            return oldItem == newItem
        }

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ManagerAdapter.ManagerViewHolder {
        val binding = ManagersBinding.inflate(LayoutInflater.from(parent.context))
        return ManagerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ManagerAdapter.ManagerViewHolder, position: Int) {
        val manager = getItem(position)
        holder.bind(manager)
    }

    inner class ManagerViewHolder(private val binding: ManagersBinding):
        RecyclerView.ViewHolder(binding.root){
        fun bind(person: Manager){
            binding.namemanager.text = person.name
            binding.datemanager.text = person.date
            binding.countrymanager.text = person.country
            Glide.with(binding.manager.context)
                .load(person.picUrl)
                .override(1280, 720)
                .into(binding.manager)
        }
    }
}