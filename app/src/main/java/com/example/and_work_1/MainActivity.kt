package com.example.and_work_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun closeApp(view: View) {
        finish()
    }

    fun tapCat(view: View) {
        Toast.makeText(this, getString(R.string.activity_main_cat_toast), Toast.LENGTH_SHORT)
            .show()
    }
}