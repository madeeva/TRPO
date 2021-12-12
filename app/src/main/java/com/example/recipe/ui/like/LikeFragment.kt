package com.example.recipe.ui.like

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.recipe.databinding.FragmentLikeBinding

class LikeFragment : Fragment() {

    private lateinit var dashboardViewModel: LikeViewModel
    private var _binding: FragmentLikeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dashboardViewModel =
            ViewModelProvider(this).get(LikeViewModel::class.java)

        _binding = FragmentLikeBinding.inflate(inflater, container, false)
        val root: View = binding.root


        val button1: Button = binding.button1 //кнопка с рецептом1
        button1.text = "Классический том ям"

        val button2: Button = binding.button2 //кнопка с рецептом2
        button2.text = "Яблочный штрудель"

        val button3: Button = binding.button3 //кнопка с рецептом2
        button3.text = "Молочно-банановый коктейль"

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

