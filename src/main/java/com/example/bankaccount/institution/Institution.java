package com.example.bankaccount.institution;

import com.example.bankaccount.location.Location;
import lombok.Data;
import java.util.ArrayList;
import java.util.UUID;

@Data
public class Institution {
    private UUID id;
    private String name;
    private ArrayList<Location> locations;
}
