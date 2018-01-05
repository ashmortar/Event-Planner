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
    private Integer price = 0;
    private String[] couponCodes = {"DJSentMe", "30%Off"};
    private String[] couponCodeRequirements = {"at lease 150 people, buy food and drink", "no requirements! Just savings!"};
    private String[] packages = {"Wedding Package", "Birthday Package", "Reunion Package"};
    private String[] packageDetails = {"INCLUDES: Dinner, DJ and Beer and Wine for 75 people! COST: 2500 SAVINGS: 225", "INCLUDES: Cake, Juice and Soda plus our fabulous Clown for 15 people! COST: 200 SAVINGS: 75", "INCLUDES: Dinner, Full Bar and a Live Band for 100 people! COST: 3800 SAVINGS: 500!!"};
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
        List<String> foodWithPriceReturn = new ArrayList<String>();
        for (Integer i = 0; i < foodOptions.length; i++) {
            foodWithPriceReturn.add(foodOptions[i] + ": " + foodPrices[i] + " per person");
        }
        return foodWithPriceReturn;
    }

    public String[] getDrinkOptions() {
        return drinkOptions;
    }

    public Object getDrinkPrices() {
        List<String> drinkWithPriceReturn = new ArrayList<String>();
        for (Integer i = 0; i < drinkOptions.length; i++) {
            drinkWithPriceReturn.add(drinkOptions[i] + ": " + drinkPrices[i] + " per person");
        }
        return drinkWithPriceReturn;
    }

    public String[] getEntertainmentOptions() {
        return entertainmentOptions;
    }

    public Object getEntertainmentPrices() {
        List<String> entertainmentWithPriceReturn = new ArrayList<String>();
        for (Integer i = 0; i < entertainmentOptions.length; i++) {
            entertainmentWithPriceReturn.add(entertainmentOptions[i] + ": " + entertainmentPrices[i]);
        }
        return entertainmentWithPriceReturn;
    }

    public String[] getCouponCodes() {
        return couponCodes;
    }
    public Object getCouponCodeWithRequirements() {
        List<String> couponCodesWithRequirements = new ArrayList<String>();
        for (Integer i = 0; i < couponCodes.length; i++) {
            couponCodesWithRequirements.add(couponCodes[i] + " REQUIREMENTS: " + couponCodeRequirements[i]);
        }
        return couponCodesWithRequirements;
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

    public Object getPackages() {
        List<String> packagesWithDetailsReturn = new ArrayList<String>();
        for (Integer i = 0; i < packages.length; i++) {
            packagesWithDetailsReturn.add(packages[i] + " " + packageDetails[i]);
        }
        return packagesWithDetailsReturn;
    }

    //Other Methods ------------------------------------------------------------------------------

    public Object calculatePrice(String input) {
        int foodIndex = Arrays.asList(foodOptions).indexOf(food);
        int drinkIndex = Arrays.asList(drinkOptions).indexOf(drinks);
        int entertainmentIndex = Arrays.asList(entertainmentOptions).indexOf(entertainment);
        if (numberOfGuests == 0) {
            return false;
        } else if (input.equals("DJSentMe")){
            if (numberOfGuests >= 150 && !food.equals("none") && !drinks.equals("none") && entertainment.equals("DJ")) {
                price = numberOfGuests * (foodPrices[foodIndex] + drinkPrices[drinkIndex]);
            } else {
                return false;
            }
        } else if (input.equals("30%Off")) {
            price = ((numberOfGuests * (foodPrices[foodIndex] + drinkPrices[drinkIndex]) + entertainmentPrices[entertainmentIndex]) * 7) / 10;
        } else
            price = numberOfGuests * (foodPrices[foodIndex] + drinkPrices[drinkIndex]) + entertainmentPrices[entertainmentIndex];
        return price;
    }
}
