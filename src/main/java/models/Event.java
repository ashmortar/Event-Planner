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
        return null;
    }
}
