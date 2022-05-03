package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class DivideBySixTest {
    @Test
    public void whenNumberDivideBy6() {
        int in = 24;
        String result = DivideBySix.checkNumber(in);
        String expected = "Iskhodnoe chislo delitsya na 6.";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNumberDivideBy3AndNotEven() {
        int in = 9;
        String result = DivideBySix.checkNumber(in);
        String expected = "Iskhodnoe chislo delitsya na 3, no ne yavlyaetsya chetnym.";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNumberNoDivideBy3AndEven() {
        int in = 14;
        String result = DivideBySix.checkNumber(in);
        String expected = "Iskhodnoe chislo ne delitsya na 3, no yavlyaetsya chetnym";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNumberNoDivideBy3AndNotEven() {
        int in = 25;
        String result = DivideBySix.checkNumber(in);
        String expected = "Iskhodnoe chislo ne delitsya na 3 i ne yavlyaetsya chetnym.";
        Assert.assertEquals(expected, result);
    }
}