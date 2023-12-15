package com.j3thr0.truekeapi.domain.models;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class Collaborator extends User{

    private String phone;
    private String name;
    private String surname;
    private String email;
    private LocalDate birthDate;
    private String nick;

    @Builder.Default
    private List<Event> collaborations = new ArrayList<>();
}
