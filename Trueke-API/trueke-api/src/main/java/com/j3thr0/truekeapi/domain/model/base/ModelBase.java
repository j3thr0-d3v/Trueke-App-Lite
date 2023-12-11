package com.j3thr0.truekeapi.domain.model.base;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@NoArgsConstructor
@Getter
@SuperBuilder
@MappedSuperclass
public abstract class ModelBase<T extends ModelBase<T>>{

    @Id
    @Builder.Default
    private UUID id = UUID.randomUUID();

}
