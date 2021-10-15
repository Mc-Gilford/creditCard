package com.example.bankaccount.entity;

import lombok.Data;

import javax.persistence.Id;
import java.util.List;

@Data
public class SectionZone {
    @Id
    private Integer id;
    List<String> componentZone;
}
