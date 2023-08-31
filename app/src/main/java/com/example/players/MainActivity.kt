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
        goalkeeperlist.add(GoalKeeper("https://img.chelseafc.com/image/upload/f_auto,w_400,q_90/editorial/people/first-team/2023-24/Sanchez_profile_avatar_23-24-removebg.png",
            "Robert Sánchez", "18 November, 1997", "Spain"))
        goalkeeperlist.add(GoalKeeper("https://img.chelseafc.com/image/upload/f_auto,w_400,q_90/editorial/people/first-team/2023-24/Bettinelli_profile_avatar_23-24-removebg.png",
            "Marcus Betinelli", "24 May, 1992", "England"))
        goalkeeperlist.add(GoalKeeper("https://img.chelseafc.com/image/upload/f_auto,w_400,q_90/editorial/people/first-team/2023-24/Djordje_Petrovic_23-24_profile_temporary_avatar-removebg.png",
            "Djordje Petrovic", "8 October, 1999", "Serbia"))
        goalkeeperlist.add(GoalKeeper("https://img.chelseafc.com/image/upload/f_auto,h_860,q_50/editorial/people/academy/2023-24/Bergstrom_profile_avatar_23-24-removebg.png",
            "Lucas Bergstrom", "5 September, 2002", "Finland"))
        goalkeeperlist.add(GoalKeeper("https://img.chelseafc.com/image/upload/f_auto,h_860,q_50/editorial/people/academy/2023-24/Beach_profile_avatar_23-24-removebg.png",
            "Eddie Beach", "9 October, 2003", "England"))

        val adapterkeeper = GoalKeeperAdapter()
        binding.keeper.adapter = adapterkeeper
        adapterkeeper.submitList(goalkeeperlist)

        binding.defenders.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val defenderlist = mutableListOf<Defender>()
        defenderlist.add(Defender("https://tmssl.akamaized.net/images/foto/galerie/badiashile-benoit-2022-2023-chelsea-1022320529h1jpg-1691154771-113326.jpg?lm=1691154788",
        "Benoit Badiashile", "26 March, 2001", "France"))
        defenderlist.add(Defender("https://cdn1.thechelseachronicle.com/uploads/17/2023/08/GettyImages-1612669477.jpg",
            "Levi Colwill", "26 February, 2003", "England"))
        defenderlist.add(Defender("https://img.chelseafc.com/image/upload/f_auto,w_1440,c_fill,g_faces,q_90/editorial/news/2023/05/30/thiago-silva-applauds-fans.jpg",
            "Thiago Silva", "22 September, 1984", "Brazil"))
        defenderlist.add(Defender("https://assets.goal.com/v3/assets/bltcc7a7ffd2fbf71f5/blt063271f75ab89851/634044477afe3e10dd7057e7/Wesley_Fofana_Chelsea_2022-23.jpg?auto=webp&format=pjpg&width=3840&quality=60",
            "Wesley Fofana", "17 December, 2000", "France"))
        defenderlist.add(Defender("https://e0.365dm.com/23/08/2048x1152/skysports-ben-chilwell-chelsea_6254403.jpg",
            "Ben Chilwell", "21 December, 1996", "England"))
        defenderlist.add(Defender("https://estaticos-cdn.sport.es/clip/151982c5-ce49-4853-8bd8-fb4ea1c4f79d_alta-libre-aspect-ratio_default_0.jpg",
            "Marc Cucurella", "22 July, 1998", "Spain"))
        defenderlist.add(Defender("https://cdn1.ntv.com.tr/gorsel/UAi0C1ClMkCoTYAUgDPUnA.jpg?width=952&height=540&mode=both&scale=both",
            "Reece James", "8 December, 1999", "England"))
        defenderlist.add(Defender("https://i2-prod.football.london/incoming/article27550154.ece/ALTERNATES/s1227b/0_Gusto.jpg",
            "Malo Gusto", "19 May, 2003", "France"))

        val adapterdefender = DefenderAdapter()
        binding.defenders.adapter = adapterdefender
        adapterdefender.submitList(defenderlist)

        binding.midfielders.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val midfielderlist = mutableListOf<Midfielder>()
        midfielderlist.add(Midfielder("https://img.chelseafc.com/image/upload/f_auto,h_860,q_50/editorial/people/first-team/2023-24/Avatar_3333x5000_Fernandez.png",
            "Enzo Fernandez", "17 January, 2001", "Argentina"))
        midfielderlist.add(Midfielder("https://img.chelseafc.com/image/upload/f_auto,h_860,q_50/editorial/people/first-team/2023-24/Caicedo_profile_avatar_23-24-removebg_2.png",
            "Moises Caicedo", "2 November, 2001", "Ecuador"))
        midfielderlist.add(Midfielder("https://img.chelseafc.com/image/upload/f_auto,h_860,q_50/editorial/people/first-team/2023-24/Avatar_3333x5000_Gallagher.png",
            "Conor Gallagher", "6 February, 2000", "England"))
        midfielderlist.add(Midfielder("https://img.chelseafc.com/image/upload/f_auto,h_860,q_50/editorial/people/first-team/2023-24/Ugochukwu_profile_avatar_23-24-removebg.png",
            "Lesley Ugochukwu", "26 March, 2004", "France"))

        val adaptermidfielder = MidfielderAdapter()
        binding.midfielders.adapter = adaptermidfielder
        adaptermidfielder.submitList(midfielderlist)
    }
}
