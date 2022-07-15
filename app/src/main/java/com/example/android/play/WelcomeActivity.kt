package com.example.android.play

import android.content.Intent
import android.os.Bundle
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