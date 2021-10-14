package com.example.bankaccount.interfaces;

import com.example.bankaccount.entity.location.Location;

import java.util.UUID;

public interface LocationImpl {
    public Location getLocation(UUID id);
    public void updateLocation(Location location, UUID id);
    public void insertLocation(Location location);
    public void deleteLocation(UUID id);
    public void getAtms(Location location);
}
