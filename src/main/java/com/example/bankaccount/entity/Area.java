package com.example.bankaccount.entity;

import lombok.Data;

import javax.persistence.Id;

@Data
public class Area {
    @Id
    private Integer id;
    private Zone zone;
}
