package com.example.authservice.entity;

import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@ToString
@Entity
public class User {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "name")
    private String namr;
    @Column(name = "psw")
    private String psw;

}
