package com.example.players

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.players.databinding.DefendersBinding

class DefenderAdapter: ListAdapter<Defender, DefenderAdapter.DefenderViewHolder>(DiffCallBack){

    companion object DiffCallBack: DiffUtil.ItemCallback<Defender>(){
        override fun areItemsTheSame(oldItem: Defender, newItem: Defender): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: Defender, newItem: Defender): Boolean {
            return oldItem == newItem
        }

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DefenderAdapter.DefenderViewHolder {
        val binding = DefendersBinding.inflate(LayoutInflater.from(parent.context))
        return DefenderViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DefenderAdapter.DefenderViewHolder, position: Int) {
        val defender = getItem(position)
        holder.bind(defender)
    }

    inner class DefenderViewHolder(private val binding: DefendersBinding):
        RecyclerView.ViewHolder(binding.root){
        fun bind(person: Defender){
            binding.namedefender.text = person.name
            binding.datedefender.text = person.date
            binding.countrydefender.text = person.country
            Glide.with(binding.defender.context)
                .load(person.picUrl)
                .override(1280, 720)
                .into(binding.defender)
        }
    }
}