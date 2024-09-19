package com.example.consumerferiado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val apiFeriadoResponse = RetrofitModule.getInstance().create(ApiService::class.java)
        MainScope().launch {
            val result = apiFeriadoResponse.getFeriados()
            if(result != null) {
                Log.d("Feriados: ", result.body().toString())
            }
        }

    }
}