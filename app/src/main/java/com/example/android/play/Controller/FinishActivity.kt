package com.example.android.play.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android.play.EXTRA_PLAYER
import com.example.android.play.Models.Player
import com.example.android.play.R
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)
        message.text = "Let find a ${player?.league} and ${player?.skill} level club"
    }
}