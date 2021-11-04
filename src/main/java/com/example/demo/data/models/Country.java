package com.example.demo.data.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
@Data
public class Country {
    String Name;
    @Id
    String Code;
}
