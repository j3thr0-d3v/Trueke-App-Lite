package com.j3thr0.truekeapi.infrastructure.adapters.out.converters;

import com.j3thr0.truekeapi.domain.enums.USER_ROLES;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.Set;
import java.util.stream.Collectors;

@Converter
public class UserRolesConverter implements AttributeConverter<Set<USER_ROLES>, String> {

    private final String SEPARATOR = ",";

    @Override
    public String convertToDatabaseColumn(Set<USER_ROLES> attribute) {
        return !attribute.isEmpty() ?
                attribute.stream()
                        .map(USER_ROLES::name)
                        .collect(Collectors.joining(SEPARATOR))
                :null;
    }

    @Override
    public Set<USER_ROLES> convertToEntityAttribute(String s) {
        return 
    }
}
