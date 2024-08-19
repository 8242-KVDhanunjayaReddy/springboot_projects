package com.example.demo;


import jakarta.persistence.*;
import lombok.*;
import lombok.NoArgsConstructor;
@Data
@Entity
@Table(name = "employees")
@NoArgsConstructor

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name="last name")
    private String lastName;

    @Column(name="email")
    private String emailId;

    }
