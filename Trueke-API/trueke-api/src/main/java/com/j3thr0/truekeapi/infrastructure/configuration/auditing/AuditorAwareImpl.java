package com.j3thr0.truekeapi.infrastructure.configuration.auditing;

import com.j3thr0.truekeapi.domain.models.User;
import org.springframework.data.domain.AuditorAware;
import org.springframework.lang.NonNull;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Optional;
import java.util.UUID;

public class AuditorAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        Authentication authentication =
                SecurityContextHolder.getContext().getAuthentication();
        return Optional.ofNullable(authentication)
                .map(auth -> (User)auth.getPrincipal())
                .map(User::getId)
                .map(UUID::toString);
    }
}
