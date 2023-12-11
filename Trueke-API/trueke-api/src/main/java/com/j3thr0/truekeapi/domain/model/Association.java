package com.j3thr0.truekeapi.domain.model;

import com.j3thr0.truekeapi.domain.model.base.ModelBase;
import com.j3thr0.truekeapi.domain.vo.Address;
import com.j3thr0.truekeapi.domain.vo.ContactInfo;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Association extends ModelBase<Association> {

    private String nif;
    private String name;
    private ContactInfo contact;
    private Address address;
    private String mission;

    @Builder.Default
    private List<Staff> team = new ArrayList<>();

    @Builder.Default
    private List<Event> events = new ArrayList<>();

}
