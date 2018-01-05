package models;

public class Event {
        //properties
    private Integer numberOfGuests = 0;
    private String food = "none";
    private String drinks = "none";
    private String entertainment = "none";

        //getter methods
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

    //setter methods
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
        return "failed test";
    }
}
