package com.example.bankaccount.entity;

import com.example.bankaccount.services.JsonUrlImpl;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonReader;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

@Data
@Slf4j
public class JsonGetter implements JsonUrlImpl {
    private String url;
    @Override
    public JsonObject getJson() throws IOException {
        URL url = new URL(this.url);
        HttpURLConnection httpConnection = getConnection(url);
        log.warn("Connected url "+httpConnection.toString());
        BufferedReader br = new BufferedReader(new InputStreamReader((httpConnection.getInputStream())));
        StringBuilder output = new StringBuilder();
        int cp;
        while ((cp = br.read()) != -1)
        {
            output.append((char) cp);
        }
        //log.info("Outpu "+output);
        String jsonString = output.toString();
        //jsonString=jsonString.replace(");","");
        //jsonString=jsonString.replace("jsonCallback(","");
        JsonObject json = new Gson().fromJson(jsonString,JsonObject.class);
        return json;
    }

    @Override
    public HttpURLConnection getConnection(URL url) throws IOException {
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Accept", "application/json");
        if (connection.getResponseCode() != 200)
        {
            throw new RuntimeException("Failed : HTTP error code : " + connection.getResponseCode());
        }
        return connection;
    }

    @Override
    public JsonArray getJsonArray() throws IOException {
        URL url = new URL(this.url);
        HttpURLConnection httpConnection = getConnection(url);
        log.warn("Connected url "+httpConnection.toString());
        BufferedReader br = new BufferedReader(new InputStreamReader((httpConnection.getInputStream())));
        StringBuilder output = new StringBuilder();
        int cp;
        while ((cp = br.read()) != -1)
        {
            output.append((char) cp);
        }
        String jsonString = output.toString();
        JsonArray json = new Gson().fromJson(jsonString,JsonArray.class);
        return json;
    }
}
