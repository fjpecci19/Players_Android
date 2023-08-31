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

        binding.goalkeepers.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

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
        binding.goalkeepers.adapter = adapterkeeper
        adapterkeeper.submitList(goalkeeperlist)

        binding.defenders.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        val defenderlist = mutableListOf<Defender>()
        defenderlist.add(Defender("https://img.chelseafc.com/image/upload/f_auto,h_860,q_50/editorial/people/first-team/2023-24/Disasi_profile_avatar_23-24-removebg.png",
            "Axel Disasi", "11 March, 1998", "France"))
        defenderlist.add(Defender("https://img.chelseafc.com/image/upload/f_auto,w_400,q_90/editorial/people/first-team/2023-24/Avatar_3333x5000_Cucurella.png",
            "Marc Cucurella", "22 July, 1998", "Spain"))
        defenderlist.add(Defender("https://img.chelseafc.com/image/upload/f_auto,w_400,q_90/editorial/people/first-team/2023-24/Avatar_3333x5000__Badiashile.png",
        "Benoit Badiashile", "26 March, 2001", "France"))
        defenderlist.add(Defender("https://img.chelseafc.com/image/upload/f_auto,w_400,q_90/editorial/people/first-team/2023-24/Avatar_3333x5000_Silva.png",
            "Thiago Silva", "22 September, 1984", "Brazil"))
        defenderlist.add(Defender("https://img.chelseafc.com/image/upload/f_auto,h_860,q_50/editorial/people/first-team/2023-24/3333x5000_Headshot_Image_Chalobah.png",
            "Trevoh Chalobah", "5 July, 1999", "England"))
        defenderlist.add(Defender("https://img.chelseafc.com/image/upload/f_auto,w_400,q_90/editorial/people/first-team/2023-24/Avatar_3333x5000_Chilwell.png",
            "Ben Chilwell", "21 December, 1996", "England"))
        defenderlist.add(Defender("https://img.chelseafc.com/image/upload/f_auto,w_400,q_90/editorial/people/first-team/2023-24/Avatar_3333x5000_James.png",
            "Reece James", "8 December, 1999", "England"))
        defenderlist.add(Defender("https://img.chelseafc.com/image/upload/f_auto,w_400,q_90/editorial/people/first-team/2023-24/Colwill_profile_avatar_23-24-removebg.png",
            "Levi Colwill", "26 February, 2003", "England"))
        defenderlist.add(Defender("https://img.chelseafc.com/image/upload/f_auto,w_400,q_90/editorial/people/first-team/2023-24/Gusto_profile_avatar_23-24-removebg.png",
            "Malo Gusto", "19 May, 2003", "France"))
        defenderlist.add(Defender("https://img.chelseafc.com/image/upload/f_auto,h_860,q_50/editorial/people/academy/2023-24/Maatsen_profile_avatar_23-24-removebg.png",
            "Ian Maatsen", "10 March, 2002", "Netherlands"))
        defenderlist.add(Defender("https://img.chelseafc.com/image/upload/f_auto,w_400,q_90/editorial/people/first-team/2023-24/Avatar_3333x5000_Fofana_W.png",
            "Wesley Fofana", "17 December, 2000", "France"))
        defenderlist.add(Defender("https://img.chelseafc.com/image/upload/f_auto,h_860,q_50/editorial/people/academy/2023-24/Humphreys_profile_avatar_23-24-removebg.png",
            "Bashir Humphreys", "15 March, 2003", "England"))
        defenderlist.add(Defender("https://img.chelseafc.com/image/upload/f_auto,h_860,q_50/editorial/people/first-team/2022-23/Sarr_profile_avatar_final_22-23.png",
            "Malang Sarr", "23 January, 1999", "France"))

        val adapterdefender = DefenderAdapter()
        binding.defenders.adapter = adapterdefender
        adapterdefender.submitList(defenderlist)

        binding.midfielders.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        val midfielderlist = mutableListOf<Midfielder>()
        midfielderlist.add(Midfielder("https://img.chelseafc.com/image/upload/f_auto,h_860,q_50/editorial/people/first-team/2023-24/Avatar_3333x5000_Fernandez.png",
            "Enzo Fernandez", "17 January, 2001", "Argentina"))
        midfielderlist.add(Midfielder("https://img.chelseafc.com/image/upload/f_auto,h_860,q_50/editorial/people/first-team/2023-24/Ugochukwu_profile_avatar_23-24-removebg.png",
            "Lesley Ugochukwu", "26 March, 2004", "France"))
        midfielderlist.add(Midfielder("https://img.chelseafc.com/image/upload/f_auto,h_860,q_50/editorial/people/first-team/2023-24/Avatar_3333x5000_CHUKWUEMEKA.png",
            "Carney Chukwuemeka", "20 October, 2003", "England"))
        midfielderlist.add(Midfielder("https://img.chelseafc.com/image/upload/f_auto,h_860,q_50/editorial/people/first-team/2023-24/Avatar_3333x5000_Gallagher.png",
            "Conor Gallagher", "6 February, 2000", "England"))
        midfielderlist.add(Midfielder("https://img.chelseafc.com/image/upload/f_auto,h_860,q_50/editorial/people/first-team/2023-24/Caicedo_profile_avatar_23-24-removebg_2.png",
            "Moises Caicedo", "2 November, 2001", "Ecuador"))
        midfielderlist.add(Midfielder("https://img.chelseafc.com/image/upload/f_auto,h_860,q_50/editorial/people/first-team/2023-24/Lavia_profile_avatar_23-24-removebg.png",
            "Romeo Lavia", "6 January, 2004", "Belgium"))

        val adaptermidfielder = MidfielderAdapter()
        binding.midfielders.adapter = adaptermidfielder
        adaptermidfielder.submitList(midfielderlist)

        binding.forwards.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        val forwardlist = mutableListOf<Forward>()
        forwardlist.add(Forward("https://img.chelseafc.com/image/upload/f_auto,h_860,q_50/editorial/people/first-team/2023-24/Avatar_3333x5000_Sterling.png",
        "Raheem Sterling", "8 December, 1994", "England"))
        forwardlist.add(Forward("https://img.chelseafc.com/image/upload/f_auto,h_860,q_50/editorial/people/first-team/2023-24/Avatar_3333x5000_Mudryk.png",
            "Mykhailo Mudryk", "5 January, 2001", "Ukraine"))
        forwardlist.add(Forward("https://img.chelseafc.com/image/upload/f_auto,h_860,q_50/editorial/people/first-team/2023-24/Avatar_3333x5000_Madueke.png",
            "Noni Madueke", "10 March, 2002", "England"))
        forwardlist.add(Forward("https://img.chelseafc.com/image/upload/f_auto,h_860,q_50/editorial/people/first-team/2023-24/Jackson_profile_avatar_23-24-removebg.png",
            "Nicolas Jackson", "20 June, 2001", "Senegal"))
        forwardlist.add(Forward("https://img.chelseafc.com/image/upload/f_auto,h_860,q_50/editorial/people/first-team/2023-24/Nkunku_profile_avatar_23-24-removebg.png",
            "Christopher Nkunku", "14 November, 1997", "France"))
        forwardlist.add(Forward("https://img.chelseafc.com/image/upload/f_auto,h_860,q_50/editorial/people/first-team/2023-24/Avatar_3333x5000_Broja.png",
            "Armando Broja", "10 September, 2001", "Albania"))
        forwardlist.add(Forward("https://img.chelseafc.com/image/upload/f_auto,h_860,q_50/editorial/people/academy/2023-24/Burstow_profile_avatar_23-24-removebg.png",
            "Mason Burstow", "4 August, 2003", "England"))
        forwardlist.add(Forward("https://img.chelseafc.com/image/upload/f_auto,h_860,q_50/editorial/people/first-team/2023-24/Moreira_profile_avatar_23-24-removebg.png",
            "Diego Moreira", "6 August, 2004", "Portugal"))
        forwardlist.add(Forward("https://img.chelseafc.com/image/upload/f_auto,h_860,q_50/editorial/people/first-team/2022-23/Hudson-Odoi_profile_avatar_final_22-23.png",
            "Callum Hudson-Odoi", "7 November, 2000", "England"))
        forwardlist.add(Forward("https://img.chelseafc.com/image/upload/f_auto,h_860,q_50/editorial/people/first-team/2023-24/Deivid_Washington_23-24_profile_avatar-removebg.png",
            "Deivid Washington", "5 June, 2005", "Brazil"))

        val adapterforward = ForwardAdapter()
        binding.forwards.adapter = adapterforward
        adapterforward.submitList(forwardlist)

        binding.managers.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        val managerlist = mutableListOf<Manager>()
        managerlist.add(Manager("https://img.chelseafc.com/image/upload/f_auto,h_860,q_50/editorial/people/management/2023-24/Mauricio_Pochettino_profile_23-24_avatar-removebg.png",
        "Mauricio Pochettino", "2 March, 1972", "Argentina"))

        val adaptermanager = ManagerAdapter()
        binding.managers.adapter = adaptermanager
        adaptermanager.submitList(managerlist)
    }
}
