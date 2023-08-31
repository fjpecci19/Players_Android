package com.example.players

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.players.databinding.MidfieldersBinding

class MidfielderAdapter: ListAdapter<Midfielder, MidfielderAdapter.MidfielderViewHolder>(DiffCallBack){

    companion object DiffCallBack: DiffUtil.ItemCallback<Midfielder>(){
        override fun areItemsTheSame(oldItem: Midfielder, newItem: Midfielder): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: Midfielder, newItem: Midfielder): Boolean {
            return oldItem == newItem
        }

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MidfielderAdapter.MidfielderViewHolder {
        val binding = MidfieldersBinding.inflate(LayoutInflater.from(parent.context))
        return MidfielderViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MidfielderAdapter.MidfielderViewHolder, position: Int) {
        val midfielder = getItem(position)
        holder.bind(midfielder)
    }

    inner class MidfielderViewHolder(private val binding: MidfieldersBinding):
        RecyclerView.ViewHolder(binding.root){
        fun bind(person: Midfielder){
            binding.namemidfielder.text = person.name
            binding.datemidfielder.text = person.date
            binding.countrymidfielder.text = person.country
            Glide.with(binding.midfielder.context)
                .load(person.picUrl)
                .override(1280, 720)
                .into(binding.midfielder)
        }
    }
}