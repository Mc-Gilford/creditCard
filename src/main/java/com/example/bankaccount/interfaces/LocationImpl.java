package com.example.bankaccount.interfaces;

import com.example.bankaccount.entity.atm.Atm;
import com.example.bankaccount.entity.location.Location;

import java.util.List;
import java.util.UUID;

public interface LocationImpl {
    public Location getLocation(UUID id);
    public void updateLocation(Location location, UUID id);
    public void insertLocation(Location location);
    public void deleteLocation(UUID id);
    public List<Atm> getAtms(Location location);
    public List<Location> getLocations();
}
