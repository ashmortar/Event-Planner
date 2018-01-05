package models;

public class Event {


        //properties-----------------------------------------------------------------------------
    private Integer numberOfGuests = 0;
    private String food = "none";
    private String drinks = "none";
    private String entertainment = "none";
    private String[] foodOpions = {"Brunch", "Lunch", "Dinner", "Dessert", "Cake", "Light Snacks"};

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

    public String[] getFoodOpions() {
        String[] output = {"something", "something else"};
        return output;
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
