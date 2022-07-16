package com.example.android.play.Controller

import kotlinx.android.synthetic.main.activity_league.*
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.android.play.EXTRA_LEAGUE
import com.example.android.play.R

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun menOnclick(view: View){

        womenLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        selectedLeague = "men"

    }

    fun womenOnclick(view: View){
        menLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        selectedLeague = "women"
    }

    fun coedOnclick(view: View){
        menLeagueBtn.isChecked = false
        womenLeagueBtn.isChecked = false

        selectedLeague = "co-ed"
    }

    fun leagueNextOnclick(view: View){
        if(selectedLeague != ""){
            var skillActivity = Intent(this,SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE,selectedLeague)
            startActivity(skillActivity)
        }
        else{
            Toast.makeText(this,"Please select a league",Toast.LENGTH_SHORT).show()
        }
    }
}