package com.iesam.alertsfood.alerts.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.iesam.alertsfood.alerts.data.AlertDataRepository
import com.iesam.alertsfood.databinding.AlertFragmentBinding

class AlertsFragment: Fragment() {
    private lateinit var binding: AlertFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
        val viewModel by lazy {
            val alertDataRepository = AlertDataRepository(requireContext())
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = AlertFragmentBinding.inflate(layoutInflater)
        val view = binding.root
        view
    }
    fun setupView(){

    }
}