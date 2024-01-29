package com.example.demo.model;
 
import javax.persistence.Entity;
import javax.persistence.Id;
 
@Entity
@Table(name="CLIENTS")
public class Client {
    @Id
    private Long id;
    private String name;
 
    // Getters and setters
}