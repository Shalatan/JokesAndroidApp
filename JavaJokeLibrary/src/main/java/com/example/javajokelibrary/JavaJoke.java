package com.example.javajokelibrary;

import java.util.ArrayList;
import java.util.Random;

public class JavaJoke
{
    ArrayList<String> jokes;
    Random random;
    public JavaJoke()
    {
        random = new Random();
        jokes = new ArrayList<String>();
        jokes.add("JOKE 1");
        jokes.add("JOKE 2");
        jokes.add("JOKE 3");
        jokes.add("JOKE 4");
        jokes.add("JOKE 5");
        jokes.add("JOKE 6");
    }

    public String getJokes()
    {
        return jokes.get(random.nextInt(jokes.size()));
    }
}