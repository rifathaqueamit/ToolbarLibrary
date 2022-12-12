package com.rha.toolbarlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rha.collapsingtoolbarlibrary.CollapsingToolbarUtility

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val title = CollapsingToolbarUtility.getTitle()
    }
}