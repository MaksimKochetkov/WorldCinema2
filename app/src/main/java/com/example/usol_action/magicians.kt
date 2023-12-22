package com.example.usol_action

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class magicians : AppCompatActivity() {
    lateinit var tl:TabLayout
    lateinit var vp:ViewPager2
    private val fraglist = listOf(BlankFragment(), BlankFragment2(), BlankFragment3())
    private val tablist = listOf("В тренде", "Новинки", "Для вас")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_magicians)
        tl = findViewById(R.id.tabLayout)
        vp = findViewById(R.id.fragmentholder)
        val adapter = viewadapter(this, fraglist)
        vp.adapter=adapter
        TabLayoutMediator(tl,vp) {
            tab,pos -> tab.text = tablist[pos]
        }.attach()
    }
}