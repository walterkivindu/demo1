package com.example.demo.data.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Branch {
    @Column
    String Name;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long Id;
    @ManyToOne
    Country country;
}
