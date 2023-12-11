package com.j3thr0.truekeapi.domain.vo;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public class ScheduleItem {

    private LocalDateTime start;
    private LocalDateTime end;

}
