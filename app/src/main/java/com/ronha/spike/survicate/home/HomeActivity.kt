package com.ronha.spike.survicate.home

import android.os.Bundle
import com.ronha.spike.survicate.base.BaseActivity
import com.ronha.spike.survicate.databinding.ActivityHomeBinding

class HomeActivity : BaseActivity<ActivityHomeBinding>() {

    override fun getActivityBinding(): ActivityHomeBinding {
        return ActivityHomeBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}