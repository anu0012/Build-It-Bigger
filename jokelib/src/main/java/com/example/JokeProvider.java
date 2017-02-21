package com.example;

import java.util.Random;

public class JokeProvider {
    public static final String[] jokesArray = new String[] {
        "Q. How did the programmer die in the shower?\n" +
                "A. He read the shampoo bottle instructions: Lather. Rinse. Repeat.",
            "Why do programmers always mix up Halloween and Christmas? \n" +
                    "Because Oct 31 equals Dec 25.",
            "“Knock, knock.”\n" +
                    "“Who’s there?”\n" +
                    "very long pause….\n" +
                    "“Java.”",
            "Programming is like sex:\n" +
                    "One mistake and you have to support it for the rest of your life.",
            "Debugging: Removing the needles from the haystack.",
            "A SQL query goes to a restaurant, walks up to 2 tables and says “Can I join you”?"
    };

    public static String getJokes(){
        Random random = new Random();
        int idx = random.nextInt(jokesArray.length);
        return jokesArray[idx];
    }
}
