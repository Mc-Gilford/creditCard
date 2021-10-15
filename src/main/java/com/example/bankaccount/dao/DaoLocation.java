package com.example.bankaccount.dao;

import com.example.bankaccount.entity.JsonGetter;
import com.example.bankaccount.entity.atm.Atm;
import com.example.bankaccount.entity.location.Location;
import com.example.bankaccount.interfaces.LocationImpl;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;
import java.util.UUID;
@Slf4j
public class DaoLocation implements LocationImpl {

    @Override
    public String getLocation(String state, String cp, String gps, JsonGetter getterJson) throws IOException {
        JsonArray json = getterJson.getJsonArray();
        JsonArray jsonFinalLocation = new JsonArray();
        for (Object myObject : json) {
            Gson gson = new Gson();
            Location location= gson.fromJson((JsonElement) myObject,Location.class);
            if(location.getState().compareTo(state)==0 || location.getCp().compareTo(cp) == 0||
                    location.getGps().compareTo(gps)==0){
            jsonFinalLocation.add((JsonElement) myObject);
            log.info("Location to string "+location.toString());
            }
        }
        return jsonFinalLocation.toString();
    }

    @Override
    public void updateLocation(Location location, UUID id) {

    }

    @Override
    public void insertLocation(Location location) {

    }

    @Override
    public void deleteLocation(UUID id) {

    }

    @Override
    public List<Atm> getAtms(Location location) {
        return null;
    }

    @Override
    public List<Location> getLocations() {
        return null;
    }
}
