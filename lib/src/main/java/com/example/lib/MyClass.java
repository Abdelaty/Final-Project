package com.example.lib;

import java.util.Random;

public class MyClass {

    private String[] jokes;
    private Random random;

    public MyClass() {
        jokes = new String[5];
        jokes[0] = "A bear walks into a bar and says to the bartender, \"I'll have a pint of beer and a.......... packet of peanuts.\"\n" +
                "\n" +
                "The bartender asks, \"Why the big pause?\"";
        jokes[1] = "Can a kangaroo jump higher than a house? - Of course, a house doesn’t jump at all.";
        jokes[2] = "What is grey and can't fly? - A fat pigeon ";
        jokes[3] = "    Anton, do you think I’m a bad mother? My name is Paul.";
        jokes[4] = "Mama kangaroo is jumping along the bush. Suddenly, a small penguin peeks out of her pouch, vomits and says, “Damn this student exchange!";


        random = new Random();
    }

    public String[] getJokes() {
        return jokes;
    }

    public String getRandomJoke() {
        return jokes[random.nextInt(jokes.length)];
    }
}
