package com.example.players

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.players.databinding.GoalkeepersBinding

class GoalKeeperAdapter: ListAdapter<GoalKeeper, GoalKeeperAdapter.GoalKeeperViewHolder>(DiffCallBack){

    companion object DiffCallBack: DiffUtil.ItemCallback<GoalKeeper>(){
        override fun areItemsTheSame(oldItem: GoalKeeper, newItem: GoalKeeper): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: GoalKeeper, newItem: GoalKeeper): Boolean {
            return oldItem == newItem
        }

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GoalKeeperAdapter.GoalKeeperViewHolder {
        val binding = GoalkeepersBinding.inflate(LayoutInflater.from(parent.context))
        return GoalKeeperViewHolder(binding)
    }

    override fun onBindViewHolder(holder: GoalKeeperAdapter.GoalKeeperViewHolder, position: Int) {
        val player = getItem(position)
        holder.bind(player)
    }

    inner class GoalKeeperViewHolder(private val binding: GoalkeepersBinding):
        RecyclerView.ViewHolder(binding.root){
            fun bind(person: GoalKeeper){
                binding.namekeeper.text = person.name
                binding.datekeeper.text = person.date
                Glide.with(binding.keeper.context)
                    .load(person.picUrl)
                    .override(1280, 720)
                    .into(binding.keeper)
            }
    }
}