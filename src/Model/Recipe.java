/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author sruthisivasankar
 */
public class Recipe {
    String recipeTitle;
    int noOfServing;
    boolean isGlutenFree;
    double difficultyLevel;
    int noOfIngredients;
    String categoryOfFood;
    String description;
    String Image; 
    
    public Recipe(){
    }

    public void setRecipeTitle(String recipeTitle) {
        this.recipeTitle = recipeTitle;
    }

    public void setNoOfServing(int noOfServing) {
        this.noOfServing = noOfServing;
    }

    public void setIsGlutenFree(boolean isGlutenFree) {
        this.isGlutenFree = isGlutenFree;
    }

    public void setDifficultyLevel(double difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public void setNoOfIngrediaents(int noOfIngrediaents) {
        this.noOfIngredients = noOfIngrediaents;
    }

    public void setCategoryOfFood(String categoryOfFood) {
        this.categoryOfFood = categoryOfFood;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }

    public String getRecipeTitle() {
        return recipeTitle;
    }

    public int getNoOfServing() {
        return noOfServing;
    }

    public boolean isIsGlutenFree() {
        return isGlutenFree;
    }

    public double getDifficultyLevel() {
        return difficultyLevel;
    }

    public int getNoOfIngrediaents() {
        return noOfIngredients;
    }

    public String getCategoryOfFood() {
        return categoryOfFood;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return Image;
    }
    @Override
        public String toString(){
        return recipeTitle;
    }
}
