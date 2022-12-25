package com.hasbi.core.events.radarEvents;

import com.hasbi.core.events.BaseEvent;

public class RadarDeletedEvent extends BaseEvent<String> {
    public RadarDeletedEvent(String id) {
        super(id);
    }
}
