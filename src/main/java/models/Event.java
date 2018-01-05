package models;

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
        return drinkOptions;
    }

    //setter methods------------------------------------------------------------------------------
    public Integer setNumberOfGuests(Integer input) {
        numberOfGuests = input;
        return numberOfGuests;
    }
    public String setFood(String input) {
        food = input;
        return food;
    }
    public String setDrinks(String input) {
        drinks = input;
        return drinks;
    }
    public String setEntertainment(String input) {
        entertainment = input;
        return entertainment;
    }
}
