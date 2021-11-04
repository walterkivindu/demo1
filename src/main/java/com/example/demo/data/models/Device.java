package com.example.demo.data.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@Entity
public class Device {
    @Id
    String SerialNumber;
    String Model;
    @OneToOne
    Branch branch;
}
