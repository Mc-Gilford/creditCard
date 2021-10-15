package com.example.bankaccount.entity;

import lombok.Data;

import javax.persistence.Id;

@Data
public class Services {
    @Id
    private Integer id;
    private Area area;
}
