package com.ronha.spike.survicate.main

import android.os.Bundle
import com.ronha.spike.survicate.base.BaseActivity
import com.ronha.spike.survicate.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun getActivityBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
}