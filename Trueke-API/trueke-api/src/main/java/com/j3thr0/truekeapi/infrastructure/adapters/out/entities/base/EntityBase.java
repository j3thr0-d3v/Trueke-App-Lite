package com.j3thr0.truekeapi.infrastructure.adapters.out.entities.base;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@NoArgsConstructor
@Getter
@SuperBuilder
@MappedSuperclass
public abstract class EntityBase <T extends EntityBase<T>>{

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
}
