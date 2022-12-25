package com.hasbi.infractions.commad.aggregartes;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import com.hasbi.core.commands.infractionCommands.*;
import com.hasbi.core.events.infractionEvents.*;
import  com.hasbi.core.exceptions.InfractionNotFoundException;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;

import java.util.Date;

@Aggregate
@Slf4j
public class InfractionAggregate {
    @Getter
    @AggregateIdentifier
    private String id;

    @Getter
    private Date date;

    @Getter
    private double speed;

    @Getter
    private double montant;

    @Getter
    private String vehiculeId;

    @Getter
    private String radarId;

    public InfractionAggregate() {
    }

    String AggregateIdentifier(){
        return "Agg-"+this.id;
    }

    @CommandHandler
    public InfractionAggregate(CreateInfractionCommand command) {
        /*TODO: validations*/
        AggregateLifecycle.apply(new InfractionCreatedEvent(
            command.getCommandId(),command.getDate(), command.getSpeed(), command.getMontant(), command.getVehiculeId(),command.getRadarId()
        ));
    }

    @EventSourcingHandler
    public void on(InfractionCreatedEvent event){
        this.id = event.getId();
        this.date = event.getDate();
        this.montant = event.getMontant();
        this.speed = event.getSpeed();
        this.radarId = event.getRadarId();
        this.vehiculeId = event.getVehiculeId();
    }

    @CommandHandler
    public void handle(UpdateInfractionCommand command){
        if(command.getCommandId() == null || command.getCommandId().isBlank()) throw new  InfractionNotFoundException("");

        AggregateLifecycle.apply(new InfractionUpdatedEvent(
                command.getCommandId(),command.getDate(), command.getSpeed(), command.getMontant(), command.getVehiculeId(),command.getRadarId()
        ));
    }

    @EventSourcingHandler
    public void on(InfractionUpdatedEvent event){
        this.id = event.getId();
        this.date = event.getDate();
        this.montant = event.getMontant();
        this.speed = event.getSpeed();
        this.radarId = event.getRadarId();
        this.vehiculeId = event.getVehiculeId();
    }

    @CommandHandler
    public void handle(DeleteInfractionCommand command){
        if(command.getCommandId() == null || command.getCommandId().isBlank()) throw new  InfractionNotFoundException("");
        AggregateLifecycle.apply(new InfractionDeletedEvent(
                command.getCommandId()));
    }

    @EventSourcingHandler
    public void on(InfractionDeletedEvent event){
        this.id = event.getId();
        log.warn("Deleting Infraction : "+event.getId());
    }



}
