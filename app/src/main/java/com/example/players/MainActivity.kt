package com.example.players

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.players.databinding.ActivityMainBinding

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        binding.players.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val playerlist = mutableListOf<Player>()
        playerlist.add(Player("https://cdn.elnacional.com.py/2021/12/Jean-Fernandes-Cerro-Porteno.jpg",
            "Jean Fernandes", "26 de Octubre de 1995"))
        playerlist.add(Player("https://versuspy2.fra1.cdn.digitaloceanspaces.com/versus/wp-content/uploads/2023/02/20122531/eduardo-brock-2.jpeg",
            "Eduardo Brock", "6 de mayo de 1991"))
        playerlist.add(Player("https://grupovierci.brightspotcdn.com/dims4/default/49fa08b/2147483647/strip/false/crop/1300x840+0+0/resize/1300x840!/quality/90/?url=https%3A%2F%2Fk2-prod-grupo-vierci.s3.amazonaws.com%2Fbrightspot%2Fd5%2F57%2F71db873945dbb7b0311674d646b7%2Fcecilio-dominguez-1.jpg",
            "Cecilio Domínguez", "11 de agosto de 1994"))

        val adapter = PlayerAdapter()
        binding.players.adapter = adapter
        adapter.submitList(playerlist)
    }
}
