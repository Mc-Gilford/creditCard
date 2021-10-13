package com.example.bankaccount.location;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;
@Getter
@Setter
@ToString

public class Location {
    private UUID id;
    private String gps;
    private String cp;
    private String state;
}
