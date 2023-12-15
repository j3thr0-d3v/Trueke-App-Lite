package com.j3thr0.truekeapi.domain.models.base;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@NoArgsConstructor
@Getter
@SuperBuilder
public abstract class ModelBase<T extends ModelBase<T>> {

    @Builder.Default
    private UUID id = UUID.randomUUID();

}
