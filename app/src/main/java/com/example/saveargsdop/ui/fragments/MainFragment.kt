package com.example.saveargsdop.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.saveargsdop.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setName()
    }

    private fun setName() {
       binding.btnName.setOnClickListener {
            val name = binding.edName.text
            val hello = "Саламалексус, $name"

            findNavController().navigate(
                MainFragmentDirections.actionMainFragmentToSecondFragment(hello)
            )
        }
    }
}