package com.example.recipe.ui.like

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.recipe.R

class LikeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_like)

        val recipeName: TextView = findViewById(R.id.recipeName)
        recipeName.text = "Классический Том Ям"

        val cookTime: TextView = findViewById(R.id.cookTime)
        cookTime.text = "40 минут"

        val complexity: TextView = findViewById(R.id.complexity2)
        complexity.text = "средний"

        val category: TextView = findViewById(R.id.category2)
        category.text = "основные блюда"

        val ingredients: TextView = findViewById(R.id.ingredients2)
        ingredients.text = "1 ингредиент\n2 ингредиент\n3 ингредиент"

        val descriptions: TextView = findViewById(R.id.descriptions)
        descriptions.text = "1 шаг\n2 шаг\n3 шаг"
    }
}