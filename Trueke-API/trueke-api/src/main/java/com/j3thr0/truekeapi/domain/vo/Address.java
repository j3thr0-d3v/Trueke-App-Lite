package com.j3thr0.truekeapi.domain.vo;

import lombok.Builder;

@Builder
public class Address {

    private String street;
    private int number;
    private String door;
    private String cp;

}
