package com.ronha.spike.survicate.main

import android.os.Bundle
import com.ronha.spike.survicate.R
import com.ronha.spike.survicate.base.BaseActivity
import com.ronha.spike.survicate.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun getActivityBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val fm = supportFragmentManager
        val transaction = fm.beginTransaction()
        transaction.replace(R.id.main_fl_container, MainFragment.newInstance(), MainFragment.TAG)
        transaction.commit()
    }
}