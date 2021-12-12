package com.example.recipe.ui.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.recipe.databinding.FragmentHomeBinding
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup


class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        var button_search: Button = binding.buttonSearch
        button_search.text = "Поиск"

        var tag1: Chip = binding.chip1
        tag1.text = "основные блюда"

        var tag2: Chip = binding.chip2
        tag2.text = "десерт"

        var tag3: Chip = binding.chip3
        tag3.text = "напитки"

        var tag4: Chip = binding.chip4
        tag4.text = "легкий"

        var tag5: Chip = binding.chip5
        tag5.text = "средний"

        var tag6: Chip = binding.chip6
        tag6.text = "сложный"

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}