package recipesearch;
import java.sql.Array;
import java.util.Arrays;
import java.util.List;

import se.chalmers.ait.dat215.lab2.Recipe;

public class RecipeBackendController {
    private String cuisine;
    private String mainIngredient;
    private String difficulty;
    private int maxPrice;
    private int maxTime;

    public List<Recipe> getRecipes(){

        return null;
    }

    public void voidsetCuisine(String cuisine){
        String[] cuisineList = {"Sverige","Grekland","Indien","Asien","Afrika","Frankrike"};
        if (Arrays.asList(cuisineList).contains(cuisine)){
            this.cuisine = cuisine;
        } else{
            this.cuisine = null;
        }
    }

    public void setMainIngredient(String mainIngredient){
    String[] IngredientsList = {"Kött","Fisk","Kyckling","Vegetarisk"};
        if (Arrays.asList(IngredientsList).contains(mainIngredient)){
            this.mainIngredient = mainIngredient;
        } else{
            this.mainIngredient = null;
        }
    }

    public void setDifficulty(String difficulty){
        String[] difficultyList = {"Lätt","Mellan","Svår"};
            if(Arrays.asList(difficultyList).contains(difficulty)){
                this.difficulty = difficulty;
            } else{
                this.difficulty = difficulty;
            }
    }

    public void setMaxPrice(int maxPrice){
        if(maxPrice > 0){
            this.maxPrice = maxPrice;
        } else{
            this.maxPrice = 0;
        }
    }

    public void setMaxTime(int maxTime){
        if(maxTime > 0 && maxTime < 150 && maxTime %10 == 0){
            this.maxTime = maxTime;
        } else{
            this.maxTime = 0;
        }
    }
}







