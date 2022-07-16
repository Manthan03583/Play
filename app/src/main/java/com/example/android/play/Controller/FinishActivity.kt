package com.example.android.play.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android.play.EXTRA_LEAGUE
import com.example.android.play.EXTRA_SKILL
import com.example.android.play.R
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        var league = intent.getStringExtra(EXTRA_LEAGUE).toString()
        var skill = intent.getStringExtra(EXTRA_SKILL).toString()

        message.text = "Let find a $league and $skill level club"
    }
}