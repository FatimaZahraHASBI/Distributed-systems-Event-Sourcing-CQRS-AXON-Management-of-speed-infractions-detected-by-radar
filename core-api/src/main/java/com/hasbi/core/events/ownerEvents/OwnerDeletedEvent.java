package com.hasbi.core.events.ownerEvents;

import com.hasbi.core.events.BaseEvent;

public class OwnerDeletedEvent extends BaseEvent<String> {
    public OwnerDeletedEvent(String id) {
        super(id);
    }
}
