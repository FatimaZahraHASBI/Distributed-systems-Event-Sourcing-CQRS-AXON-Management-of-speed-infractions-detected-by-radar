package com.hasbi.core.commands.infractionCommands;

import lombok.Getter;
import com.hasbi.core.commands.BaseCommand;

import java.util.Date;

public class CreateInfractionCommand extends BaseCommand<String> {
    @Getter private Date date;
    @Getter private double speed;
    @Getter private double montant;
    @Getter private String vehiculeId;
    @Getter private String radarId;

    public CreateInfractionCommand(String commandId, Date date, double speed, double montant, String vehiculeId, String radarId) {
        super(commandId);
        this.date = date;
        this.speed = speed;
        this.montant = montant;
        this.vehiculeId = vehiculeId;
        this.radarId = radarId;
    }
}
