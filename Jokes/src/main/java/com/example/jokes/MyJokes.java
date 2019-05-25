package com.example.jokes;

import java.util.Random;

public class MyJokes {

    public static String tellAJoke(){

        String [] jokes = {"Yo momma so dumb, she tried to surf the microwave",
        "Why are frogs always so happy? They eat what ever bugs them",
                "Some guy called me a tool. So I got hammered and nailed his girlfriend. Guess he was right.",
        "I couldn't figure out why the baseball kept getting larger. Then it hit me.",
        "How is Christmas like your job? You do all the work and the fat guy in the suit gets all the credit.",
        "A doctor reaches into his smock to get a pen to write a prescription and pulls out a rectal thermometer. \"Oh, damn it,\" he proclaims, \"Some asshole has my pen!\""};


        int jokeIndex = new Random().nextInt(jokes.length);
        return jokes[jokeIndex];
    }
}
