package com.example.tugas_doa_harian

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class DoaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doa)

        val imgDoa = findViewById<ImageView>(R.id.imgDoa)

        val gambar = intent.getIntExtra("gambar", 0)

        imgDoa.setImageResource(gambar)
    }
}