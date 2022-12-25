package com.hasbi.core.events.ownerEvents;

import lombok.Getter;
import com.hasbi.core.events.BaseEvent;

import java.util.Date;

public class OwnerCreatedEvent extends BaseEvent<String> {
    @Getter private String name;
    @Getter private Date birthDate;
    @Getter private String email;

    public OwnerCreatedEvent(String id, String name, Date birthDate, String email) {
        super(id);
        this.name = name;
        this.birthDate = birthDate;
        this.email = email;
    }
}
