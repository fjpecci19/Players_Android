package com.example.players

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.players.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.players.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val playerlist = mutableListOf<Player>()
        playerlist.add(Player("https://pbs.twimg.com/profile_images/1550857936708280320/EiQrUKG4_400x400.jpg", "Jean", "Brasil"))
        playerlist.add(Player("https://versuspy2.fra1.cdn.digitaloceanspaces.com/versus/wp-content/uploads/2023/02/20122531/eduardo-brock-2.jpeg", "Brock", "Brasil"))
        playerlist.add(Player("https://versuspy2.fra1.cdn.digitaloceanspaces.com/versus/wp-content/uploads/2023/02/20122531/eduardo-brock-2.jpeg", "Cecilio", "Paraguay"))

        val adapter = PlayerAdapter()
        binding.players.adapter = adapter
        adapter.submitList(playerlist)
    }
}
