package com.ronha.spike.survicate.home

import android.os.Bundle
import com.ronha.spike.survicate.base.BaseActivity
import com.ronha.spike.survicate.databinding.ActivityHomeBinding
import com.ronha.spike.survicate.utils.toast
import com.survicate.surveys.Survicate
import com.survicate.surveys.SurvicateAnswer
import com.survicate.surveys.SurvicateEventListener

class HomeActivity : BaseActivity<ActivityHomeBinding>() {

    companion object {
        const val SCREEN_NAME = "rutadeldia"
    }

    override fun getActivityBinding(): ActivityHomeBinding {
        return ActivityHomeBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupSurvicate()
    }

    private fun setupSurvicate() {
        Survicate.enterScreen(SCREEN_NAME)
        Survicate.setEventListener(object : SurvicateEventListener() {
            override fun onSurveyDisplayed(surveyId: String) {
                toast("on survey displayed")
            }

            override fun onQuestionAnswered(
                surveyId: String,
                questionId: Long,
                answer: SurvicateAnswer
            ) {
                toast("on question answered")
            }

            override fun onSurveyClosed(surveyId: String) {
                toast("on survey closed")
            }

            override fun onSurveyCompleted(surveyId: String) {
                toast("on survey completed")
            }
        })
    }

    override fun onDestroy() {
        super.onDestroy()
        Survicate.leaveScreen(SCREEN_NAME)
    }
}