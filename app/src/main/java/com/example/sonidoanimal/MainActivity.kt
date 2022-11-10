package com.example.sonidoanimal

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    private lateinit var s1: MediaPlayer
    private lateinit var s2: MediaPlayer
    private lateinit var s3: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        s1 = MediaPlayer.create(this,R.raw.lluvias)
        s2 = MediaPlayer.create(this,R.raw.caballo)
        s3 = MediaPlayer.create(this,R.raw.gallina)
    }

    fun funLluvia(view: View){
        if(s1.isPlaying==false){
            s1.start()
        }else s1.pause()
    }
    fun funCaballo(view: View){
        if(s2.isPlaying==false){
            s2.start()
        }else s2.pause()
    }
    fun funPollos(view: View){
        if(s3.isPlaying==false){
            s3.start()
        }else s3.pause()
    }
}