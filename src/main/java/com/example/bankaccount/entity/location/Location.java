package com.example.bankaccount.entity.location;

import com.example.bankaccount.dao.DaoLocation;
import com.example.bankaccount.entity.atm.Atm;
import com.example.bankaccount.interfaces.LocationImpl;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.UUID;
@Getter
@Setter
@ToString

public class Location {
    private String id;
    private String gps;
    private String cp;
    @NonNull
    private String state;
    private List<Atm> atms;


    /*
    @GetMapping
    public User userInformation(@RequestParam(value="id") String name){
        return new User(UUID.randomUUID(), name);
    }*/

}
