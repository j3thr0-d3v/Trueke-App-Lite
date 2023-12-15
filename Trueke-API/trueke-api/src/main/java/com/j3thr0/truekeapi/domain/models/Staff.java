package com.j3thr0.truekeapi.domain.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class Staff extends User{

    private String dni;
    private String email;
    private String name;
    private String surname;
    private String phone;
    private Association association;
}
