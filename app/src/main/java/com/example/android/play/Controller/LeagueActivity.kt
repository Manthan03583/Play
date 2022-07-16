package com.example.android.play.Controller

import kotlinx.android.synthetic.main.activity_league.*
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.android.play.EXTRA_PLAYER
import com.example.android.play.Models.Player
import com.example.android.play.R

class LeagueActivity : BaseActivity() {

    var player = Player("","")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun menOnclick(view: View){

        womenLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        player.league = "men"

    }

    fun womenOnclick(view: View){
        menLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        player.league = "women"
    }

    fun coedOnclick(view: View){
        menLeagueBtn.isChecked = false
        womenLeagueBtn.isChecked = false

        player.league = "co-ed"
    }

    fun leagueNextOnclick(view: View){
        if(player.league != ""){
            val skillActivity = Intent(this,SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(skillActivity)
        }
        else{
            Toast.makeText(this,"Please select a league",Toast.LENGTH_SHORT).show()
        }
    }
}