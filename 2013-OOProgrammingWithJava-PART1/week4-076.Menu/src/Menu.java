
import jdk.nashorn.internal.ir.annotations.Ignore;

import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }

    // add the methods here
    public void addMeal(String meal){

        if(!this.meals.contains(meal)){
            meals.add(meal);
        } else{}

    }

    public void printMeals(){
        for(String meal : meals){
        System.out.println(meal);
        }
    }

    public void clearMenu(){
        meals.removeAll(meals);
    }
}
