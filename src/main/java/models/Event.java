package models;


import java.util.Arrays;

public class Event {


        //properties-----------------------------------------------------------------------------
    private Integer numberOfGuests = 0;
    private String food = "none";
    private String drinks = "none";
    private String entertainment = "none";
    private String[] foodOptions = {"Brunch", "Lunch", "Dinner", "Dessert", "Cake", "Light Snacks"};
    private String[] drinkOptions = {"Juice and Water", "Coffee and Tea", "Brunch Bar", "Beer and Wine", "Full Bar"};
    private String[] entertainmentOptions = {"Clown", "Magician", "Live Band", "DJ"};

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

    public String[] getDrinkOptions() {
        return drinkOptions;
    }

    public String[] getEntertainmentOptions() {
        return entertainmentOptions;
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
        entertainment = input;
        return entertainment;
    }
}
