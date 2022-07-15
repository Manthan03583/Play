package com.example.android.play

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SkillActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        var dataleague = intent.getStringExtra(EXTRA_LEAGUE).toString()
        println(dataleague)
    }
}