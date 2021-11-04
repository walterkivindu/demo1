package com.example.demo.data.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Client {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long Id;
    @OneToMany
    List<Branch> branchList;
    String Name;
}
