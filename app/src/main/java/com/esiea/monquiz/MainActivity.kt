package com.esiea.monquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.esiea.monquiz.injection.MainVuModel
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {
    private val MainVuModel: MainVuModel by inject()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MainVuModel.onstart()
    }
}