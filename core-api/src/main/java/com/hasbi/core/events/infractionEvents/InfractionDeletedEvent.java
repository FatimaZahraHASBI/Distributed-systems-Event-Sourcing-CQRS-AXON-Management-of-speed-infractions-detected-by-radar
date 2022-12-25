package com.hasbi.core.events.infractionEvents;

import com.hasbi.core.events.BaseEvent;

public class InfractionDeletedEvent extends BaseEvent<String> {
    public InfractionDeletedEvent(String id) {
        super(id);
    }
}
