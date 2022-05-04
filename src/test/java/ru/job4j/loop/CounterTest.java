package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromOneToFiveThenThirty() {
        int start = 1;
        int finish = 5;
        int result = Counter.sumByEven(start, finish);
        int expected = 6;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromOneToFifteenThen56() {
        int start = 1;
        int finish = 15;
        int result = Counter.sumByEven(start, finish);
        int expected = 56;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromOneToSixteenThen56() {
        int start = 1;
        int finish = 16;
        int result = Counter.sumByEven(start, finish);
        int expected = 72;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromOneToSixThen12() {
        int start = 1;
        int finish = 6;
        int result = Counter.sumByEven(start, finish);
        int expected = 12;
        Assert.assertEquals(expected, result);
    }

}