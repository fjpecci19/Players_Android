package com.example.players

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.players.databinding.PlayersBinding

class PlayerAdapter: ListAdapter<Player, PlayerAdapter.PlayerViewHolder>(DiffCallBack){

    companion object DiffCallBack: DiffUtil.ItemCallback<Player>(){
        override fun areItemsTheSame(oldItem: Player, newItem: Player): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: Player, newItem: Player): Boolean {
            return oldItem == newItem
        }

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayerAdapter.PlayerViewHolder {
        val binding = PlayersBinding.inflate(LayoutInflater.from(parent.context))
        return PlayerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PlayerAdapter.PlayerViewHolder, position: Int) {
        val player = getItem(position)
        holder.bind(player)
    }

    inner class PlayerViewHolder(private val binding: PlayersBinding):
        RecyclerView.ViewHolder(binding.root){
            fun bind(person: Player){
                binding.name.text = person.name
                binding.description.text = person.description
            }
    }
}