package com.hasbi.core.events.infractionEvents;

import lombok.Getter;
import com.hasbi.core.events.BaseEvent;

import java.util.Date;

public class InfractionUpdatedEvent extends BaseEvent<String> {

    @Getter private Date date;
    @Getter private double speed;
    @Getter private double montant;
    @Getter private String vehiculeId;
    @Getter private String radarId;

    public InfractionUpdatedEvent(String id, Date date, double speed, double montant, String vehiculeId, String radarId) {
        super(id);
        this.date = date;
        this.speed = speed;
        this.montant = montant;
        this.vehiculeId = vehiculeId;
        this.radarId = radarId;
    }
}
