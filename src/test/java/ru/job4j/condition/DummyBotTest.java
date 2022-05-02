package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class DummyBotTest {

    @Test
    public void whenGreetBot() {
        String in = "Hello, Bot";
        String result = DummyBot.answer(in);
        String expected = "Hello, Smart Guy";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenByeBot() {
        String in = "Bye";
        String result = DummyBot.answer(in);
        String expected = "See you soon";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenUnknownBot() {
        String in = "Сколько будет 2 + 2?";
        String result = DummyBot.answer(in);
        String expected = "It puts me in an impossible position. Ask another question.";
        Assert.assertEquals(expected, result);
    }
}