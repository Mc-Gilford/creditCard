package com.example.bankaccount.services;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public interface JsonUrlImpl {
    public JsonObject getJson() throws IOException;
    public HttpURLConnection getConnection(URL url) throws IOException;
    public JsonArray getJsonArray() throws IOException;
}
