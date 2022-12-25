package com.hasbi.radar.command.aggregates;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import com.hasbi.core.commands.radarCommands.*;
import com.hasbi.core.events.radarEvents.*;
import com.hasbi.core.exceptions.NegativeSpeedException;
import com.hasbi.core.exceptions.InvalidObjectId;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;

@Slf4j
@Aggregate
public class RadarAggregate {
    @AggregateIdentifier
    @Getter private String radarId;
    @Getter private double speed_limit;
    @Getter private float longitude;
    @Getter private  float latitude;

    public RadarAggregate() {
    }

    @CommandHandler
    public RadarAggregate(CreateRadarCommand command) {
        if(command.getSpeed_limit()<0) throw new NegativeSpeedException("Speed can not be negative");
        AggregateLifecycle.apply(new RadarCreatedEvent(
            command.getCommandId(), command.getSpeed_limit(), command.getLongitude(), command.getLatitude()
        ));
    }

    @EventSourcingHandler
    public void on(RadarCreatedEvent event){
        this.radarId = event.getId();
        this.speed_limit = event.getSpeed_limit();
        this.longitude = event.getLongitude();
        this.latitude = event.getLatitude();
    }

    @CommandHandler
    public void handle(UpdateRadarCommand command){
        log.info("Enter UpdateRadarCommand");
        if(command.getCommandId() == null || command.getCommandId().isBlank()) throw new InvalidObjectId("ID is not valid.");
        if(command.getSpeed_limit()<0) throw new NegativeSpeedException("Speed can not be negative");
        AggregateLifecycle.apply(new RadarUpdatedEvent(
                command.getCommandId(), command.getSpeed_limit(), command.getLongitude(), command.getLatitude()
        ));

        /* TODO: validate if the radar exists*/

    }

    @EventSourcingHandler
    public void on(RadarUpdatedEvent event){
        log.info("Enter RadarUpdatedEvent");
        this.radarId = event.getId();
        this.speed_limit = event.getSpeed_limit();
        this.longitude = event.getLongitude();
        this.latitude = event.getLatitude();
    }


    @CommandHandler
    public void handle(DeleteRadarCommand command){
        // validations
        AggregateLifecycle.apply(new RadarDeletedEvent(
                command.getCommandId()
        ));

        /* TODO: validate if the radar exists*/

    }

    @EventSourcingHandler
    public void on(RadarDeletedEvent event){
        log.warn("Deleting Radar: "+ event.getId());
    }

}
