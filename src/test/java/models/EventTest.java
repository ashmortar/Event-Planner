package models;

import org.junit.Test;

import static org.junit.Assert.*;

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
        String[] expectedOutput = {"Juice and Water", "Coffee and Tea", "Brunch Bar", "Beer and Wine", "Full Bar"};
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
}