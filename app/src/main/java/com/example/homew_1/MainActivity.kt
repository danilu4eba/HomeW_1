package com.example.homew_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.homew_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), CounterView {
     var presenter = Presenter()

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initclicker()
        presenter.init(this)
    }

    private fun initclicker() {
        with(binding){
            btnPlus.setOnClickListener {

              presenter.increment()
            }
        }
    }

    override fun showCount(count: String) {
        binding.tvCounter.text = count
    }

    override fun showToast(message: String) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
    }

    override fun changeColor(color: Int) {
        binding.tvCounter.setTextColor(color)
    }
}