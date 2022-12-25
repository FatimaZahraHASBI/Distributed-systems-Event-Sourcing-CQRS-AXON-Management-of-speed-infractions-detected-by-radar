package com.hasbi.core.events.radarEvents;

import lombok.Getter;
import com.hasbi.core.events.BaseEvent;

public class RadarUpdatedEvent extends BaseEvent<String> {

    @Getter
    private double speed_limit;
    @Getter
    private float longitude;
    @Getter
    private  float latitude;

    public RadarUpdatedEvent(String id, double speed_limit, float longitude, float latitude) {
        super(id);
        this.speed_limit = speed_limit;
        this.longitude = longitude;
        this.latitude = latitude;
    }
}
