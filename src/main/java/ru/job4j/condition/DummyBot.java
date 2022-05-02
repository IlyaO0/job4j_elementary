package ru.job4j.condition;

public class DummyBot {

    public static String answer(String question) {
        String rsl = "It puts me in an impossible position. Ask another question.";
        if ("Hello, Bot".equals(question)) {
            rsl = "Hello, Smart Guy";
        } else if ("Bye".equals(question)) {
            rsl = "See you soon";
        }
        return rsl;
    }

    public static void main(String[] args) {
        String rsl = DummyBot.answer("Hello, Bot");
        System.out.println(rsl);
        rsl = DummyBot.answer("Bye");
        System.out.println(rsl);
    }
}
