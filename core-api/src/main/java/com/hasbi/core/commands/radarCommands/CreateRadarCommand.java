package com.hasbi.core.commands.radarCommands;

import lombok.Getter;
import com.hasbi.core.commands.BaseCommand;

public class CreateRadarCommand extends BaseCommand<String> {
    @Getter private double speed_limit;
    @Getter private float longitude;
    @Getter private  float latitude;

    public CreateRadarCommand(String commandId, double speed_limit, float longitude, float latitude) {
        super(commandId);
        this.speed_limit = speed_limit;
        this.longitude = longitude;
        this.latitude = latitude;
    }
}
