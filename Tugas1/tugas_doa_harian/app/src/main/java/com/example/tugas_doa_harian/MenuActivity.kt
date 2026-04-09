package com.example.tugas_doa_harian

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MenuActivity : AppCompatActivity() {

    private val gambarDoa = intArrayOf(
        R.drawable.doa1,
        R.drawable.doa2,
        R.drawable.doa3,
        R.drawable.doa4,
        R.drawable.doa5
    )

    private val namaDoa = arrayOf(
        "Doa Bercermin",
        "Doa Naik Kendaraan",
        "Doa Kedua Orang Tua",
        "Doa Masuk Rumah",
        "Doa keluar Rumah"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val layoutMenu: LinearLayout = findViewById(R.id.layoutMenu)

        for (i in namaDoa.indices) {

            val view = LayoutInflater.from(this)
                .inflate(R.layout.item_menu, layoutMenu, false)

            val gambar: ImageView = view.findViewById(R.id.imgMenu)
            val teks: TextView = view.findViewById(R.id.txtMenu)

            gambar.setImageResource(gambarDoa[i])
            teks.text = namaDoa[i]

            view.setOnClickListener {

                val intent = Intent(this@MenuActivity, DoaActivity::class.java)
                intent.putExtra("gambar", gambarDoa[i])
                startActivity(intent)

            }

            layoutMenu.addView(view)
        }
    }
}