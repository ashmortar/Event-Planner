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
}