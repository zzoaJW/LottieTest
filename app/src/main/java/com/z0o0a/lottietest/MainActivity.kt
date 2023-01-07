package com.z0o0a.lottietest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import com.z0o0a.lottietest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.btnLogin.setOnClickListener {
            showAnim()
        }

    }

    private fun showAnim(){
        Handler(Looper.getMainLooper()).postDelayed({
            binding.loadingAnim.visibility = View.VISIBLE
            hideAnim()
        }, 3000) // 3초 뒤에 실행
    }

    private fun hideAnim(){
        Handler(Looper.getMainLooper()).postDelayed({
            binding.loadingAnim.visibility = View.GONE
        }, 3000) // 3초 뒤에 실행
    }
}