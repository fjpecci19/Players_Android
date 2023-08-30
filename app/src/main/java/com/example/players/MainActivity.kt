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
        goalkeeperlist.add(GoalKeeper("https://images2.minutemediacdn.com/image/upload/c_crop,w_2772,h_1559,x_0,y_53/c_fill,w_720,ar_16:9,f_auto,q_auto,g_auto/images/GettyImages/mmsport/90min_en_international_web/01h81ywvqqj7kjtdrbvr.jpg",
            "Robert Sánchez", "18 November, 1997"))
        goalkeeperlist.add(GoalKeeper("https://img.allfootballapp.com/www/M00/26/CA/720x-/-/-/CgAGVmHm54aAeeIhAADA5cXyffI361.jpg.webp",
            "Marcus Betinelli", "24 May, 1992"))
        goalkeeperlist.add(GoalKeeper("https://img.chelseafc.com/image/upload/f_auto,w_1400,q_90/restricted/2024/Petrovic%20signing%20shots/Petrovic_Cobham.jpg",
            "Djordje Petrovic", "8 October, 1999"))

        val adapterkeeper = GoalKeeperAdapter()
        binding.keeper.adapter = adapterkeeper
        adapterkeeper.submitList(goalkeeperlist)

        binding.defenders.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val defenderlist = mutableListOf<Defender>()
        defenderlist.add(Defender("https://tmssl.akamaized.net/images/foto/galerie/badiashile-benoit-2022-2023-chelsea-1022320529h1jpg-1691154771-113326.jpg?lm=1691154788",
        "Benoit Badiashile", "26 March, 2001"))
        defenderlist.add(Defender("https://cdn1.thechelseachronicle.com/uploads/17/2023/08/GettyImages-1612669477.jpg",
            "Levi Colwill", "26 February, 2003"))
        defenderlist.add(Defender("https://img.chelseafc.com/image/upload/f_auto,w_1440,c_fill,g_faces,q_90/editorial/news/2023/05/30/thiago-silva-applauds-fans.jpg",
            "Thiago Silva", "22 September, 1984"))
        defenderlist.add(Defender("https://assets.goal.com/v3/assets/bltcc7a7ffd2fbf71f5/blt063271f75ab89851/634044477afe3e10dd7057e7/Wesley_Fofana_Chelsea_2022-23.jpg?auto=webp&format=pjpg&width=3840&quality=60",
            "Wesley Fofana", "17 December, 2000"))
        defenderlist.add(Defender("https://e0.365dm.com/23/08/2048x1152/skysports-ben-chilwell-chelsea_6254403.jpg",
            "Ben Chilwell", "21 December, 1996"))
        defenderlist.add(Defender("https://estaticos-cdn.sport.es/clip/151982c5-ce49-4853-8bd8-fb4ea1c4f79d_alta-libre-aspect-ratio_default_0.jpg",
            "Marc Cucurella", "22 July, 1998"))
        defenderlist.add(Defender("https://cdn1.ntv.com.tr/gorsel/UAi0C1ClMkCoTYAUgDPUnA.jpg?width=952&height=540&mode=both&scale=both",
            "Reece James", "8 December, 1999"))
        defenderlist.add(Defender("https://i2-prod.football.london/incoming/article27550154.ece/ALTERNATES/s1227b/0_Gusto.jpg",
            "Malo Gusto", "19 May, 2003"))

        val adapterdefender = DefenderAdapter()
        binding.defenders.adapter = adapterdefender
        adapterdefender.submitList(defenderlist)

        binding.midfielders.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val midfielderlist = mutableListOf<Midfielder>()
        midfielderlist.add(Midfielder("https://www.infobae.com/new-resizer/HHlcSiL8_rZl8UzF12ZL4KNLxKA=/arc-anglerfish-arc2-prod-infobae/public/YTQ76NWOZFWXBXLVO6O3BZXCZQ.jpg",
            "Enzo Fernandez", "17 January, 2001"))
        midfielderlist.add(Midfielder("https://www.eluniverso.com/resizer/Jd_n4M7pbPfvxpiw0aF9hYQ-8Us=/1122x670/smart/filters:quality(70)/cloudfront-us-east-1.images.arcpublishing.com/eluniverso/KKUNLTNHQBGVNFEOQUQ6Q6UKJE.jpg",
            "Moises Caicedo", "2 November, 2001"))
        midfielderlist.add(Midfielder("https://assets.goal.com/v3/assets/bltcc7a7ffd2fbf71f5/blt5f059f718fe8fcac/63c7bc73dbbabb75c987855d/Gallagher.jpg?auto=webp&format=pjpg&width=3840&quality=60",
            "Conor Gallagher", "6 February, 2000"))
        midfielderlist.add(Midfielder("https://sportal365images.com/process/smp-images-production/ringier.africa/01082023/33b80b7f-53dc-4260-9b71-6c7cc203f17b.jpg?operations=fit(480:)",
            "Lesley Ugochukwu", "26 March, 2004"))

        val adaptermidfielder = MidfielderAdapter()
        binding.midfielders.adapter = adaptermidfielder
        adaptermidfielder.submitList(midfielderlist)
    }
}
