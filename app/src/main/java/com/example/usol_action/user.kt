package com.example.usol_action

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.Toolbar

class user : AppCompatActivity() {
    lateinit var tb: Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        tb=findViewById(R.id.toolbar)
        setSupportActionBar(this.tb)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title="Пользователь"
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

    fun btn(view: View) {
            val inte = Intent(this, magicians::class.java)
            startActivity(inte)
            finish()
        }
}