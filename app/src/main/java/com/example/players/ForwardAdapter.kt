package com.example.players

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.players.databinding.ForwardsBinding

class ForwardAdapter:  ListAdapter<Forward, ForwardAdapter.ForwardViewHolder>(DiffCallBack){

    companion object DiffCallBack: DiffUtil.ItemCallback<Forward>(){
        override fun areItemsTheSame(oldItem: Forward, newItem: Forward): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: Forward, newItem: Forward): Boolean {
            return oldItem == newItem
        }

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ForwardAdapter.ForwardViewHolder {
        val binding = ForwardsBinding.inflate(LayoutInflater.from(parent.context))
        return ForwardViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ForwardAdapter.ForwardViewHolder, position: Int) {
        val forward = getItem(position)
        holder.bind(forward)
    }

    inner class ForwardViewHolder(private val binding: ForwardsBinding):
        RecyclerView.ViewHolder(binding.root){
        fun bind(person: Forward){
            binding.nameforward.text = person.name
            binding.dateforward.text = person.date
            binding.countryforward.text = person.country
            Glide.with(binding.forward.context)
                .load(person.picUrl)
                .override(1280, 720)
                .into(binding.forward)
        }
    }
}