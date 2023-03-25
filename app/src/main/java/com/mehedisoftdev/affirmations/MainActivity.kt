package com.mehedisoftdev.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mehedisoftdev.affirmations.adapter.ItemAdapter
import com.mehedisoftdev.affirmations.data.DataSource
import com.mehedisoftdev.affirmations.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dataset = DataSource().loadAffirmations()
        binding.recyclerView.adapter = ItemAdapter(this, dataset)
        binding.recyclerView.setHasFixedSize(true)
    }

  }