package com.hasbi.core.events.vehicleEvents;

import com.hasbi.core.events.BaseEvent;

public class VehicleDeletedEvent extends BaseEvent<String> {
    public VehicleDeletedEvent(String id) {
        super(id);
    }
}
