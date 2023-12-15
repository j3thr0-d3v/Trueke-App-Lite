package com.j3thr0.truekeapi.domain.models;

import com.j3thr0.truekeapi.domain.enums.USER_ROLES;
import com.j3thr0.truekeapi.domain.models.base.ModelBase;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public abstract class User extends ModelBase<User> {

    private String username;
    private String password;

    @Builder.Default
    private boolean accountNonExpired = true;

    @Builder.Default
    private boolean accountNonLocked = true;

    @Builder.Default
    private boolean credentialsNonExpired = true;

    @Builder.Default
    private boolean enabled = true;

    private Set<USER_ROLES> roles;

}
