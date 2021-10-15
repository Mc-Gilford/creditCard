package com.example.bankaccount.entity;

import javax.persistence.Id;
import java.util.List;

public class Zone {
    @Id
    private Integer id;
    private List<SectionZone> sectionZoneList;
}
