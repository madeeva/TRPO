package com.example.recipe.ui.plus

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.recipe.databinding.FragmentPlusBinding
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.R


class PlusFragment : Fragment() {

    private lateinit var notificationsViewModel: PlusViewModel
    private var _binding: FragmentPlusBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    var complexity = arrayOf("легкий", "средний", "сложный")
    var categories = arrayOf("основные блюда", "десерт", "напитки")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        notificationsViewModel =
            ViewModelProvider(this).get(PlusViewModel::class.java)

        _binding = FragmentPlusBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val complexityList: Spinner = binding.complexity
        val adapter1 = ArrayAdapter(requireActivity(), R.layout.simple_spinner_dropdown_item, complexity)
        adapter1.setDropDownViewResource(R.layout.simple_spinner_dropdown_item)
        complexityList.adapter = adapter1

        val categoryList: Spinner = binding.category
        val adapter2 = ArrayAdapter(requireActivity(), R.layout.simple_spinner_dropdown_item, categories)
        adapter2.setDropDownViewResource(R.layout.simple_spinner_dropdown_item)
        categoryList.adapter = adapter2

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}