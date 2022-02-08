package com.example.authservice.Domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import lombok.*;


import javax.persistence.Entity;
import javax.persistence.Id;

@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class UserDomain {
    @JsonProperty
    private String name;

    @JsonProperty
    private String psw;



}
