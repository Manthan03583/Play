package com.example.android.play.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.android.play.EXTRA_PLAYER
import com.example.android.play.Models.Player
import com.example.android.play.R
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    lateinit var player: Player

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(EXTRA_PLAYER,player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        player = intent.getParcelableExtra(EXTRA_PLAYER)!!

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        player = savedInstanceState.getParcelable(EXTRA_PLAYER)!!
    }

    fun onBeginnerClick(view: View){
        expert.isChecked = false
        player.skill = "beginner"
    }

    fun onExpertCLick(view: View){
        beginner.isChecked = false
        player.skill = "expert"
    }

    fun onSkillNext(view: View){
        if(player.skill != ""){
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(finishActivity)
        }

        else{
            Toast.makeText(this,"Please select a skill level",Toast.LENGTH_SHORT).show()
        }
    }

}