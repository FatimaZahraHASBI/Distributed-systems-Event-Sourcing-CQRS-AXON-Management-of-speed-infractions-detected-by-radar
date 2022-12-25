package com.hasbi.core.events.vehicleEvents;

import lombok.Getter;
import com.hasbi.core.events.BaseEvent;

public class VehicleUpdatedEvent extends BaseEvent<String> {
    @Getter private String num_matricule;
    @Getter private String marque;
    @Getter private int model;
    @Getter private float puissance_fiscal;

    public VehicleUpdatedEvent(String id, String num_matricule, String marque, int model, float puissance_fiscal) {
        super(id);
        this.num_matricule = num_matricule;
        this.marque = marque;
        this.model = model;
        this.puissance_fiscal = puissance_fiscal;
    }
}
