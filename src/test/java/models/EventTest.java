package models;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;


public class EventTest {

    @Test
    public void Event_instantiatesCorrectly_true() throws Exception {
        Event testEvent = new Event();
        assertEquals(true, testEvent instanceof Event);
    }

    @Test
    public void getNumberOfGuests_returnsIntegerPropertyOfEvent_0() throws Exception {
        Event testEvent = new Event();
        Integer expectedOutput = 0;
        assertEquals(expectedOutput, testEvent.getNumberOfGuests());
    }

    @Test
    public void getFood_returnsStringPropertyOfEvent_None() throws Exception {
        Event testEvent = new Event();
        String expectedOutput = "none";
        assertEquals(expectedOutput, testEvent.getFood());
    }

    @Test
    public void getDrinks_returnsStringPropertyOfEvent_None() throws Exception {
        Event testEvent = new Event();
        String expectedOutput = "none";
        assertEquals(expectedOutput, testEvent.getDrinks());
    }

    @Test
    public void getEntertainment_returnsStringPropertyOfEvent_None() throws Exception {
        Event testEvent = new Event();
        String expectedOutput = "none";
        assertEquals(expectedOutput, testEvent.getEntertainment());
    }

    @Test
    public void setNumberOfGuests_changesNumberOfGuests_100() throws Exception {
        Event testEvent = new Event();
        Integer expectedOutput = 100;
        assertEquals(expectedOutput, testEvent.setNumberOfGuests(100));
    }

    @Test
    public void setFood_changesFood_Dinner() throws Exception {
        Event testEvent = new Event();
        String expectedOutput = "Dinner";
        assertEquals(expectedOutput, testEvent.setFood("Dinner"));
    }

    @Test
    public void setDrinks_changesDrinks_FullBar() throws Exception {
        Event testEvent = new Event();
        String expectedOutput = "Full Bar";
        assertEquals(expectedOutput, testEvent.setDrinks("Full Bar"));
    }

    @Test
    public void setEntertainment_changesEntertainment_LiveBand() throws Exception {
        Event testEvent = new Event();
        String expectedOutput = "Live Band";
        assertEquals(expectedOutput, testEvent.setEntertainment("Live Band"));
    }

    @Test
    public void getFoodOptions_returnsOptionsForFood_StringArray() throws Exception {
        Event testEvent = new Event();
        String[] expectedOutput = {"Brunch", "Lunch", "Dinner", "Dessert", "Cake", "Light Snacks"};
        assertArrayEquals(expectedOutput, testEvent.getFoodOptions());
    }

    @Test
    public void getDrinkOptions_returnsOptionsForDrinks_StringArray() throws Exception {
        Event testEvent = new Event();
        String[] expectedOutput = {"Juice and Soda", "Coffee and Tea", "Brunch Bar", "Beer and Wine", "Full Bar"};
        assertArrayEquals(expectedOutput, testEvent.getDrinkOptions());
    }

    @Test
    public void getEntertainmentOptions_returnsOptionsForEnterTainment_StringArray() throws Exception {
        Event testEvent = new Event();
        String[] expectedOutput = {"Clown", "Magician", "Live Band", "DJ"};
        assertArrayEquals(expectedOutput, testEvent.getEntertainmentOptions());
    }

    @Test
    public void setFood_returnsErrorIfInputIsNotOnFoodOptionList_false() throws Exception {
        Event testEvent = new Event();
        Boolean expectedOutput = false;
        assertEquals(expectedOutput, testEvent.setFood("yolo"));
    }

    @Test
    public void setDrinks_returnsErrorIfInputIsNotOnDrinkOptionList_false() throws Exception {
        Event testEvent = new Event();
        Boolean expectedOuput = false;
        assertEquals(expectedOuput, testEvent.setDrinks("yolo"));
    }

    @Test
    public void setEntertainment_returnsErrorIfInputIsNotOnEntertainmentOptionsList_false() throws Exception {
        Event testEvent = new Event();
        Boolean expectedOutpu = false;
        assertEquals(expectedOutpu, testEvent.setEntertainment("yolo"));
    }

    @Test
    public void getFoodPrices_returnsListOfFoodAndPriceOfFoodPerPerson_ArrayList() throws Exception {
        Event testEvent = new Event();
        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("Brunch: 15 per person");
        expectedOutput.add("Lunch: 20 per person");
        expectedOutput.add("Dinner: 25 per person");
        expectedOutput.add("Dessert: 5 per person");
        expectedOutput.add("Cake: 10 per person");
        expectedOutput.add("Light Snacks: 5 per person");
        assertEquals(expectedOutput, testEvent.getFoodPrices());
    }

    @Test
    public void getDrinkPrices_returnsListOfDrinksAndPRiceOfFoodPerPerson_ArrayList() throws Exception {
        Event testEvent = new Event();
        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("Juice and Soda: 5 per person");
        expectedOutput.add("Coffee and Tea: 5 per person");
        expectedOutput.add("Brunch Bar: 10 per person");
        expectedOutput.add("Beer and Wine: 10 per person");
        expectedOutput.add("Full Bar: 15 per person");
        assertEquals(expectedOutput, testEvent.getDrinkPrices());
    }

    @Test
    public void getEntertainmentPrices_returnsListOfEntertainmentAndPrice_ArrayList() throws Exception {
        Event testEvent = new Event();
        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("Clown: 50");
        expectedOutput.add("Magician: 100");
        expectedOutput.add("Live Band: 300");
        expectedOutput.add("DJ: 100");
        assertEquals(expectedOutput, testEvent.getEntertainmentPrices());
    }

    @Test
    public void calculatePrice_CorrectlyCalculatesPriceOfEventBasedOnChoices_3800() throws Exception {
        Event testEvent = new Event();
        Integer expectedOutput = 3800;
        testEvent.setNumberOfGuests(100);
        testEvent.setFood("Dinner");
        testEvent.setDrinks("Beer and Wine");
        testEvent.setEntertainment("Live Band");
        assertEquals(expectedOutput, testEvent.calculatePrice("none"));
    }

    @Test
    public void couponCodeDJSentME_discountsCorrectlyForFreeDJ_6000() throws Exception {
        Event testEvent = new Event();
        Integer expectedOutput = 6000;
        testEvent.setNumberOfGuests(150);
        testEvent.setFood("Dinner");
        testEvent.setDrinks("Full Bar");
        testEvent.setEntertainment("DJ");
        assertEquals(expectedOutput, testEvent.calculatePrice("DJSentMe"));
    }

    @Test
    public void couponCode30PercentOff_discountsTotalPriceCorrectly_1820() throws Exception {
        Event testEvent = new Event();
        Integer expectedOutput = 1820;
        testEvent.setNumberOfGuests(100);
        testEvent.setFood("Brunch");
        testEvent.setDrinks("Brunch Bar");
        testEvent.setEntertainment("Magician");
        assertEquals(expectedOutput, testEvent.calculatePrice("30%Off"));
    }

    @Test
    public void getCouponCodes_returnsStringArrayOfValidCouponCodes_StringArray() throws Exception {
        Event testEvent = new Event();
        String[] expectedOutput = {"DJSentMe", "30%Off"};
        assertArrayEquals(expectedOutput, testEvent.getCouponCodes());
    }

    @Test
    public void getCouponCodesWithRequirements_returnsArrayListOfCodesAndRequirements_ArrayList() throws Exception {
        Event testEvent = new Event();
        List<String> expectedOutput = new ArrayList<String>();
        expectedOutput.add("DJSentMe REQUIREMENTS: at lease 150 people, buy food and drink");
        expectedOutput.add("30%Off REQUIREMENTS: no requirements! Just savings!");
        assertEquals(expectedOutput, testEvent.getCouponCodeWithRequirements());
    }

    @Test
    public void getPackages_returnsPackagesAndTheirDescriptions_ArrayList() throws Exception {
        Event testEvent = new Event();
        List<String> expectedOutput = new ArrayList<String>();
        expectedOutput.add("Wedding Package INCLUDES: Dinner, DJ and Beer and Wine for 75 people! COST: 2500 SAVINGS: 225");
        expectedOutput.add("Birthday Package INCLUDES: Cake, Juice and Soda plus our fabulous Clown for 15 people! COST: 200 SAVINGS: 75");
        expectedOutput.add("Reunion Package INCLUDES: Dinner, Full Bar and a Live Band for 100 people! COST: 3800 SAVINGS: 500!!");
        assertEquals(expectedOutput, testEvent.getPackages());
    }

    @Test
    public void checkValues_returnsFalseIfAnyFieldsHaveBadValue_false() throws Exception {
        Event testEvent = new Event();
        testEvent.setNumberOfGuests(0);
        testEvent.setFood("none");
        testEvent.setDrinks("mudbath");
        testEvent.setEntertainment("DJ");
        assertEquals(false, testEvent.checkValues());
    }
}