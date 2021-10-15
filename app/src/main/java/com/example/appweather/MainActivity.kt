package com.example.appweather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appweather.ui.main.MainFragment
import com.example.appweather.ui.main.details.DetailsFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
}