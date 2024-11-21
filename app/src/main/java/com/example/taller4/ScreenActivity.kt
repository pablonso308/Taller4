package com.example.taller4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.taller4.fragments.DetailFragment
import com.example.taller4.fragments.ListFragment

class ScreenActivity : AppCompatActivity(), ListFragment.OnItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen)
    }

    override fun onItemSelected(item: String) {
        val detailFragment = supportFragmentManager.findFragmentById(R.id.detailFragment) as DetailFragment
        detailFragment.updateDetail(item)
    }
}