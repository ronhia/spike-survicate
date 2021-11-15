package com.ronha.spike.survicate.main

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ronha.spike.survicate.base.BaseFragment
import com.ronha.spike.survicate.databinding.FragmentMainBinding
import com.ronha.spike.survicate.home.HomeActivity
import com.survicate.surveys.Survicate

class MainFragment : BaseFragment<FragmentMainBinding>() {

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentMainBinding {
        return FragmentMainBinding.inflate(inflater, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        events()
    }

    private fun events() {
        binding.mainBtnGoHome.setOnClickListener {
            val intent = Intent(requireContext(), HomeActivity::class.java)
            startActivity(intent)
        }
        binding.mainBtnCleanSurvicate.setOnClickListener {
            Survicate.reset()
        }
    }

    companion object {

        const val TAG = "fragment.home"

        @JvmStatic
        fun newInstance() = MainFragment()
    }
}