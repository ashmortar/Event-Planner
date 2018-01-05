package models;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Event {


        //properties-----------------------------------------------------------------------------
    private Integer numberOfGuests = 0;
    private String food = "none";
    private String drinks = "none";
    private String entertainment = "none";
    private String[] foodOptions = {"Brunch", "Lunch", "Dinner", "Dessert", "Cake", "Light Snacks"};
    private Integer[] foodPrices = {15, 20, 25, 5, 10, 5};
    private String[] drinkOptions = {"Juice and Soda", "Coffee and Tea", "Brunch Bar", "Beer and Wine", "Full Bar"};
    private Integer[] drinkPrices = {5, 5, 10, 10, 15};
    private String[] entertainmentOptions = {"Clown", "Magician", "Live Band", "DJ"};
    private Integer[] entertainmentPrices = {50, 100, 300, 100};

    //getter methods-------------------------------------------------------------------------
    public Integer getNumberOfGuests() {
        return numberOfGuests;
    }
    public String getFood() {
        return food;
    }
    public String getDrinks() {
        return drinks;
    }

    public String getEntertainment() {
        return entertainment;
    }

    public String[] getFoodOptions() {
        return foodOptions;
    }

    public Object getFoodPrices() {
        List<String> foodWithPriceReturn = new ArrayList<>();
        for (Integer i = 0; i < foodOptions.length; i++) {
            foodWithPriceReturn.add(foodOptions[i] + ": " + foodPrices[i] + " per person");
        }
        return foodWithPriceReturn;
    }

    public String[] getDrinkOptions() {
        return drinkOptions;
    }

    public Object getDrinkPrices() {
        List<String> drinkWithPriceReturn = new ArrayList<>();
        for (Integer i = 0; i < drinkOptions.length; i++) {
            drinkWithPriceReturn.add(drinkOptions[i] + ": " + drinkPrices[i] + " per person");
        }
        return drinkWithPriceReturn;
    }

    public String[] getEntertainmentOptions() {
        return entertainmentOptions;
    }

    public Object getEntertainmentPrices() {
        return false;
    }

    //setter methods------------------------------------------------------------------------------
    public Integer setNumberOfGuests(Integer input) {
        numberOfGuests = input;
        return numberOfGuests;
    }
    public Object setFood(String input) {
        if (Arrays.asList(foodOptions).contains(input)) {
            food = input;
            return food;
        } else {
            return false;
        }
    }
    public Object setDrinks(String input) {
        if (Arrays.asList(drinkOptions).contains(input)) {
            drinks = input;
            return drinks;
        } else {
            return false;
        }
    }
    public Object setEntertainment(String input) {
        if (Arrays.asList(entertainmentOptions).contains(input)) {
            entertainment = input;
            return entertainment;
        } else {
            return false;
        }
    }
}
