package com.eb2.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Api {

    public static String getData(String username) throws IOException {

        URL url = new URL("https://api.github.com/users/" + username + "/events");

        HttpURLConnection con = (HttpURLConnection) url.openConnection();

        con.setRequestMethod("GET");
        con.setRequestProperty("Accept", "application/json");


        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

        String inputLine;
        StringBuilder content = new StringBuilder();

        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }

        in.close();
        con.disconnect();

        return content.toString();
    }
}
