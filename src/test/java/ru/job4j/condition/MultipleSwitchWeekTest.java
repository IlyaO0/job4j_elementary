package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MultipleSwitchWeekTest {

    @Test
    public void whenDay1() {
        String day = "Понедельник";
        int name = MultipleSwitchWeek.numberOfDay(day);
        int expected = 1;
        Assert.assertEquals(expected, name);
    }

    @Test
    public void whenDay2() {
        String day = "Tuesday";
        int name = MultipleSwitchWeek.numberOfDay(day);
        int expected = 2;
        Assert.assertEquals(expected, name);
    }

    @Test
    public void whenDayWrong() {
        String day = "Teusday";
        int name = MultipleSwitchWeek.numberOfDay(day);
        int expected = -1;
        Assert.assertEquals(expected, name);
    }
}