package com.example.android.play.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.android.play.EXTRA_LEAGUE
import com.example.android.play.EXTRA_SKILL
import com.example.android.play.R
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)


    }

    fun onBeginnerClick(view: View){
        expert.isChecked = false
        skill = "beginner"
    }

    fun onExpertCLick(view: View){
        beginner.isChecked = false
        skill = "expert"
    }

    fun onSkillNext(view: View){
        if(skill != ""){
            var finishActivity = Intent(this, FinishActivity::class.java)
            var dataleague = intent.getStringExtra(EXTRA_LEAGUE).toString()
            finishActivity.putExtra(EXTRA_LEAGUE,dataleague)
            finishActivity.putExtra(EXTRA_SKILL,skill)
            startActivity(finishActivity)
        }

        else{
            Toast.makeText(this,"Please select a skill level",Toast.LENGTH_SHORT).show()
        }
    }

}