package com.imadeddine.bekkouche.imageprocessing

import android.graphics.Color
import android.graphics.PorterDuff
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView.setColorFilter(Color.BLACK)
        imageView2.setColorFilter(Color.CYAN)
        imageView3.setColorFilter(Color.YELLOW)
        imageView4.setColorFilter(Color.RED)
        imageView5.setColorFilter(Color.YELLOW,PorterDuff.Mode.DARKEN)
        imageView6.setColorFilter(Color.BLACK,PorterDuff.Mode.ADD)
        imageView7.setColorFilter(Color.BLACK,PorterDuff.Mode.MULTIPLY)
        imageView8.setColorFilter(Color.MAGENTA,PorterDuff.Mode.OVERLAY)
        imageView9.setBackgroundColor(Color.DKGRAY)
        imageView10.setBackgroundColor(Color.MAGENTA)
    }
}
