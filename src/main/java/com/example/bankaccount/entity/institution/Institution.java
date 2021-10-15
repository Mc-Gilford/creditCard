package com.example.bankaccount.entity.institution;

import com.example.bankaccount.entity.location.Location;
import com.example.bankaccount.interfaces.InstitutionImpl;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
public class Institution  {
    private UUID id;
    private String name;
    private ArrayList<Location> locations;

}
