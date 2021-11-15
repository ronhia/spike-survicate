package com.ronha.spike.survicate

import android.app.Application
import com.survicate.surveys.Survicate

class SpikeSurvicateApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initSurvicate()
    }

    private fun initSurvicate() {
        Survicate.init(this)
    }
}