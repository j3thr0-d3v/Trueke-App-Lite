package com.j3thr0.truekeapi;

import com.j3thr0.truekeapi.domain.models.*;
import com.j3thr0.truekeapi.domain.vo.Address;
import com.j3thr0.truekeapi.domain.vo.ContactInfo;
import com.j3thr0.truekeapi.domain.vo.ScheduleItem;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Component
@RequiredArgsConstructor
public class FakeMain {

    //INJECTIONS

    //METHODS

    //VAR

    //CODE
    @PostConstruct
    void init(){
        Association a1 = Association.builder()
                .nif("12345678-S")
                .name("Proyecto por la Paz ONG")
                .mission("""
                    Educamos y ayudamos a los necesitados
                    en pro de alcanzar la paz, por Jesucristo
                    Nuestro Señor.Amén
                    """)
                .contact(ContactInfo.builder()
                        .phone("954 23 14 56")
                        .email("proyectoPaz@gmail.com")
                        .build())
                .address(Address.builder()
                        .cp("41001")
                        .street("C/Doctor Ordóñez de la Barrrera")
                        .number(2)
                        .door("portal 2, 3ºE")
                        .build())
                .build();

        Collaborator c1 = Collaborator.builder()
                .username("HerMan66")
                .password("123456")
                .phone("+34 673 123 873")
                .name("Hermenegildo Manuel")
                .surname("Martínez Del Castillo")
                .email("herme.torrox@gmail.com")
                .birthDate(LocalDate.of(1933, 3,2))
                .nick("Herme")
                .build();

        Staff s1 = Staff.builder()
                .dni("87654321-L")
                .email("fer_23@gmail.com")
                .name("Fernando")
                .surname("Silva Mellado")
                .phone("+34 764 323 876")
                .association(a1)
                .build();

        a1.getTeam().add(s1);

        Event e1 = Event.builder()
                .title("Reparto Alimentos Navidad")
                .description("""
                        Vamos a juntarnos todos
                        a repartir felicidad en 
                        forma de comida y bebida
                        a todos los pobres locos y 
                        yonkis del barrio.
                        """)
                .organizer(s1)
                .association(s1.getAssociation())
                .schedule(List.of(
                        ScheduleItem.builder()
                                .start(LocalDateTime.of(2023,12,26,12,30))
                                .end(LocalDateTime.of(2023,12,26,20,0))
                                .build()
                ))
                .collaborators(List.of(c1))
                .build();

        System.out.println(a1.getId());
        System.out.println(c1);
        System.out.println(s1);

    }
}
