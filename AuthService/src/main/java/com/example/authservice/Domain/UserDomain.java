package com.example.authservice.Domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.*;

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
