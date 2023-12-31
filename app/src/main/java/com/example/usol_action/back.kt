package com.example.usol_action

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.MediaController
import android.widget.TextView
import android.widget.Toast
import android.widget.VideoView
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.RecyclerView


class back : AppCompatActivity() {
    lateinit var tb: Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_back)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        tb=findViewById(R.id.toolbar)
        setSupportActionBar(this.tb)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title="Star Wars"

        val news: RecyclerView = findViewById((R.id.charrecycle))
        news.adapter = char_adapter(this, char_list().list)
        val cadr: RecyclerView = findViewById((R.id.cadrrecycler))
        cadr.adapter = cadr_adapter(this, cadr_list().list)



    }

    override fun onOptionsItemSelected (item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                val inte = Intent (this, MainActivity::class.java)
                startActivity(inte)
                finish()
            }
            R.id.one -> {
                Toast.makeText(this, "Работает", Toast.LENGTH_SHORT).show()
            }
            R.id.two -> {
                val inte = Intent(this, MainActivity::class.java)
                startActivity(inte)
                finish()
            }
            R.id.three -> {
                val inte = Intent(this, user::class.java)
                startActivity(inte)
                finish()
            }
        }
        return true
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menushka, menu)
        return true
    }


}