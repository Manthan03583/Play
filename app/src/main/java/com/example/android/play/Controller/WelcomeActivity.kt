package com.example.android.play.Controller

import android.content.Intent
import android.os.Bundle
import com.example.android.play.R
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        button.setOnClickListener {
            var leagueactivity = Intent(this,LeagueActivity::class.java)
            startActivity(leagueactivity)
        }
    }
}