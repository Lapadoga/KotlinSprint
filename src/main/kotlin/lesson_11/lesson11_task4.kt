package org.example.lesson_11

class RecipeCategory(
    val id: Int,
    var name: String,
    var description: String,
    val recipesList: MutableList<Recipe>,
)

class Recipe(
    val id: Int,
    var name: String,
    var category: RecipeCategory,
    var inFavorites: Boolean,
    val ingredientsList: MutableMap<Ingredient, Int>,
    var cookingMethod: String,
)

class Ingredient(
    val id: Int,
    var name: String,
    var unit: String,
)