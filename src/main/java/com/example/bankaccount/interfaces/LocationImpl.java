package com.example.bankaccount.interfaces;

import com.example.bankaccount.entity.JsonGetter;
import com.example.bankaccount.entity.atm.Atm;
import com.example.bankaccount.entity.location.Location;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

public interface LocationImpl {
    public String getLocation(String state, String cp, String gps, JsonGetter getterJson) throws IOException;
    public void updateLocation(Location location, UUID id);
    public void insertLocation(Location location);
    public void deleteLocation(UUID id);
    public List<Atm> getAtms(Location location);
    public List<Location> getLocations();
}
