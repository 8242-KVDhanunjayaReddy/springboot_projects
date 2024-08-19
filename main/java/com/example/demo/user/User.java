package com.example.demo.user;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@AllArgsConstructor
@NoArgsConstructor
@Data
    public class User {
        private long id;
        private String name;
        private int age;
        private String city;

}


