package models;

public class Event {
        //properties
    private Integer numberOfGuests = 0;
    private String food = "none";

        //getter methods
    public Integer getNumberOfGuests() {
        return numberOfGuests;
    }
    public String getFood() {
        return food;
    }
    public String getDrinks() {
        return "failed test";
    }

}
