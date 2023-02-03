package com.example.saveargsdop.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.saveargsdop.databinding.FragmentSeconBinding

class SecondFragment : Fragment() {

    private val args by navArgs<SecondFragmentArgs>()
    private lateinit var binding: FragmentSeconBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSeconBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getName()
    }

    private fun getName() {
        val name = args.name
        binding.hello.text = name
    }
}