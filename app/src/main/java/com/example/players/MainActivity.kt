package com.example.players

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.players.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.statusBarColor = Color.parseColor("#000080")

        binding.keeper.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val goalkeeperlist = mutableListOf<GoalKeeper>()
        goalkeeperlist.add(GoalKeeper("https://phantom-marca.unidadeditorial.es/e7aee89d458846676439e54fb38c3e6e/resize/828/f/jpg/assets/multimedia/imagenes/2023/08/05/16912260914107.jpg",
            "Robert Sánchez", "18 November, 1997"))
        goalkeeperlist.add(GoalKeeper("https://cdn.vox-cdn.com/thumbor/A7YD9EstKIYjL4LRjXeJU8Gzkbs=/0x0:5568x3712/1200x800/filters:focal(2277x1042:3167x1932)/cdn.vox-cdn.com/uploads/chorus_image/image/69654836/1234271012.0.jpg",
            "Marcus Betinelli", "24 May, 1992"))
        goalkeeperlist.add(GoalKeeper("https://img.chelseafc.com/image/upload/f_auto,w_1400,q_90/restricted/2024/Petrovic%20signing%20shots/Petrovic_Cobham.jpg",
            "Djordje Petrovic", "8 October, 1999"))

        val adapterkeeper = GoalKeeperAdapter()
        binding.keeper.adapter = adapterkeeper
        adapterkeeper.submitList(goalkeeperlist)
    }
}
