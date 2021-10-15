package com.example.bankaccount.dao;

import com.example.bankaccount.entity.atm.Atm;
import com.example.bankaccount.entity.location.Location;
import com.example.bankaccount.interfaces.LocationImpl;

import java.util.List;
import java.util.UUID;

public class DaoLocation implements LocationImpl {
    @Override
    public Location getLocation(UUID id) {
        return null;
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
