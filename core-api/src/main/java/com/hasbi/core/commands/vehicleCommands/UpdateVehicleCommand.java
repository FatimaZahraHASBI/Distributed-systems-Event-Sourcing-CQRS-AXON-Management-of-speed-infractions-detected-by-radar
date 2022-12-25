package com.hasbi.core.commands.vehicleCommands;

import lombok.Getter;
import com.hasbi.core.commands.BaseCommand;

public class UpdateVehicleCommand extends BaseCommand<String> {
    @Getter private String num_matricule;
    @Getter private String marque;
    @Getter private int model;
    @Getter private float puissance_fiscal;

    public UpdateVehicleCommand(String commandId, String num_matricule, String marque, int model, float puissance_fiscal) {
        super(commandId);
        this.num_matricule = num_matricule;
        this.marque = marque;
        this.model = model;
        this.puissance_fiscal = puissance_fiscal;
    }
}
