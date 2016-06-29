package com.example;

import java.util.Random;

public class JokeProvider {

    private String[] jokes;

    public JokeProvider() {
        jokes=new String[]{
                "Joke 1",
                "Joke 2",
                "Joke 3",
                "Joke 4",
                "Joke 5",
                "Joke 6"
        };
    }

    public String getJoke(){
        int random=new Random().nextInt(jokes.length);
        return jokes[random];
    }

}
