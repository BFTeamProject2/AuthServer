package com.example.authservice.Domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;


import javax.persistence.Entity;
import javax.persistence.Id;

@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class UserDomain {
    @JsonProperty
    private String name;

    @JsonProperty
    private String psw;



}
