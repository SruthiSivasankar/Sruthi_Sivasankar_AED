/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author sruthisivasankar
 */
public class User {
    String chefFirstName;
    String chefLastName;
    String userName;
    
    ArrayList<Recipe>recipeList;
    Contact contact;
    
    public User(){
        this.contact= new Contact();
        this.recipeList=new ArrayList<Recipe>();
        
    }

    public void setChefFirstName(String chefFirstName) {
        this.chefFirstName = chefFirstName;
    }

    public void setChefLastName(String chefLastName) {
        this.chefLastName = chefLastName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setRecipeList(ArrayList<Recipe> recipeList) {
        this.recipeList = recipeList;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public String getChefFirstName() {
        return chefFirstName;
    }

    public String getChefLastName() {
        return chefLastName;
    }

    public String getUserName() {
        return userName;
    }

    public ArrayList<Recipe> getRecipeList() {
        return recipeList;
    }

    public Contact getContact() {
        return contact;
    }
    public Recipe createRecipe(String recipeTitle,int noOfServing,boolean isGlutenFree,double difficultyLevel,int noOfIngredients,String categoryOfFood,String description,String Image){
        Recipe recipe = new Recipe();
        
        recipe.setRecipeTitle(recipeTitle);
        recipe.setNoOfServing(noOfServing);
        recipe.setIsGlutenFree(isGlutenFree);
        recipe.setDifficultyLevel(difficultyLevel);
        recipe.setNoOfIngrediaents(noOfIngredients);
        recipe.setCategoryOfFood(categoryOfFood);
        recipe.setDescription(description);
        recipe.setImage(Image);
        
        this.recipeList.add(recipe);
        return recipe;
    }
    
    public Recipe findRecipe(String recTitle){
        for(Recipe rec:this.recipeList){
            if(rec.getRecipeTitle()==recTitle){
                return rec;
            }
        }
        return null;
    }
}
