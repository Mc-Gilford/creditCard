package com.example.bankaccount.entity.location;

import com.example.bankaccount.entity.atm.Atm;
import com.example.bankaccount.entity.user.User;
import com.example.bankaccount.interfaces.LocationImpl;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.UUID;
@Getter
@Setter
@ToString

public class Location implements LocationImpl {
    private UUID id;
    private String gps;
    private String cp;
    private String state;
    private List<Atm> atms;

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
    public void getAtms(@RequestBody Location location) {

    }
    /*
    @GetMapping
    public User userInformation(@RequestParam(value="id") String name){
        return new User(UUID.randomUUID(), name);
    }*/

}
