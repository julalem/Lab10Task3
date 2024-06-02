package org.example;

import com.google.gson.Gson;


import java.io.IOException;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) {
        JokeApiClient jokeApiClient = new JokeApiClient();
        try {
            String jokeResponse = jokeApiClient.jokeApiRequest();
            if (jokeResponse != null) {
                Gson gson = new Gson();
                Joke jokeObject = gson.fromJson(jokeResponse, Joke.class);
                System.out.println(jokeObject);
            }
        } catch (IOException | URISyntaxException | InterruptedException e) {
            System.out.println("Error occurred while fetching or parsing joke: " + e.getMessage());
        }
    }
}
