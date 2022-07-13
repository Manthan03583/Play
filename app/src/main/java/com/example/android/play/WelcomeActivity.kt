package com.example.android.play

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.content.ContextCompat.startActivity

class WelcomeActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        var playButton = findViewById<Button>(R.id.button)
        playButton.setOnClickListener {
            var leagueactivity = Intent(this,LeagueActivity::class.java)
            startActivity(leagueactivity)
        }
    }
}