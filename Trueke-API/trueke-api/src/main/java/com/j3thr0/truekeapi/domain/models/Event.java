package com.j3thr0.truekeapi.domain.models;

import com.j3thr0.truekeapi.domain.models.base.ModelBase;
import com.j3thr0.truekeapi.domain.vo.ScheduleItem;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Event extends ModelBase<Event> {

    private String title;
    private String description;
    private Association association;
    private Staff organizer;

    @Builder.Default
    private List<ScheduleItem> schedule = new ArrayList<>();

    @Builder.Default
    private List<Collaborator> collaborators = new ArrayList<>();

}
