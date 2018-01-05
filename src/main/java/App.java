import models.Event;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class App {
    public static void main(String[] args) {
        boolean isRunning = true;
        Event thisEvent = new Event();

        while(isRunning) {
            BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));

            //"display is 60 characters wide
            System.out.println("Thanks for choosing Aaron's Events. How can I help you today?");
            System.out.println("for a list of commands type: map");

            try{
                String userSelection = bufferedReader.readLine();

                if (userSelection.equals("packages")) {
                    System.out.println(thisEvent.getPackages());
                } else if (userSelection.equals("exit")){
                    System.out.println("Come again soon!");
                    isRunning = false;
                } else if (userSelection.equals("map")) {
                    System.out.println("|===========================MAP============================|");
                    System.out.println("|Exit Planner------------------------------------------exit|");
                    System.out.println("|See Packages--------------------------------------packages|");
                    System.out.println("|See Food Prices---------------------------------------food|");
                    System.out.println("|See Drink Prices-------------------------------------drink|");
                    System.out.println("|See Entertainment Prices---------------------entertainment|");
                    System.out.println("|See Coupons----------------------------------------coupons|");
                    System.out.println("|Build An Event---------------------------------------start|");
                    System.out.println("|Show This Map------------------------------------------map|");
                    System.out.println("|==========================================================|");
                } else if (userSelection.equals("food")) {
                    System.out.println(thisEvent.getFoodPrices());
                } else if (userSelection.equals("drink")) {
                    System.out.println(thisEvent.getDrinkPrices());
                } else if (userSelection.equals("entertainment")) {
                    System.out.println(thisEvent.getEntertainmentPrices());
                } else if (userSelection.equals("coupons")) {
                    System.out.println(thisEvent.getCouponCodeWithRequirements());
                }
                else if (userSelection.equals("start")) {
                    System.out.println("Great! How many guests will attend your event?");
                    int userGuestCount = Integer.parseInt(bufferedReader.readLine());
                    thisEvent.setNumberOfGuests(userGuestCount);
                    System.out.println("Which of the food options will you need?");
                    System.out.println(thisEvent.getFoodPrices());
                    String userFoodChoice = bufferedReader.readLine();
                    thisEvent.setFood(userFoodChoice);
                    System.out.println("and which of these drink options?");
                    System.out.println(thisEvent.getDrinkPrices());
                    String userDrinkChoice = bufferedReader.readLine();
                    thisEvent.setDrinks(userDrinkChoice);
                    System.out.println("Would you like one of our entertainers?");
                    System.out.println(thisEvent.getEntertainmentPrices());
                    String userEntertainmentChoice = bufferedReader.readLine();
                    thisEvent.setEntertainment(userEntertainmentChoice);
                    System.out.println("Finally, if you have a coupon code enter it now, otherwise just press enter");
                    String userCouponCode = bufferedReader.readLine();
                    if (thisEvent.checkValues()) {
                        System.out.println("Ok, with the information you've chosen your event would cost: " + thisEvent.calculatePrice(userCouponCode));
                        thisEvent.clearValues();
                    } else {
                        System.out.println("Sorry, one of your selections was invalid, please try again");
                        thisEvent.clearValues();
                    }
                }
                else {
                    System.out.println("Sorry, that wasn't a valid input");
                }








            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
