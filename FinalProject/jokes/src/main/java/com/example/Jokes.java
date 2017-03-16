package com.example;

import java.util.Random;

public class Jokes {
    private static String[] strings = {

            "A kangaroo walks into a bar and tells the bartender, " +
                    "\"Blood is the lipstick of all wounds.\"\n" +
                    "The bartender does not know how he said this or why.",

            "A bear walks into a bar and says to the bartender, \"" +
                    "I'll have a pint of beer and a.......... packet of peanuts.\"\n" +
                    "The bartender asks, \"Why the big pause?\"",

            "Bob and Jim walk into a bar. Bob says, " +
                    "\"Hey Donkeyboy, get me a drink.\" The bartender gets him a drink.\n" + "\n" +
                    "Bob says, \"Donkeyboy, get me another drink.\" The bartender gets him another drink.\n" +
                    "\n" + "Finally, Jim asks the bartender, \"Why does he call you Donkeyboy?\"\n" +
                    "\n" + "\"I don't know. Hehaw-hehaw-he always calls me that.\""

    };

    public static String getJoke() {
        Random random = new Random();
        int index = random.nextInt(strings.length - 1);
        return strings[index];
    }
}
