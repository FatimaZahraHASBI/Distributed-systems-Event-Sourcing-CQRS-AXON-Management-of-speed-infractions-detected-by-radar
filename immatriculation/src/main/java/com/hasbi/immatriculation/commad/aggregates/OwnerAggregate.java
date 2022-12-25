package com.hasbi.immatriculation.commad.aggregates;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import com.hasbi.core.commands.ownerCommands.*;
import com.hasbi.core.events.ownerEvents.*;
import com.hasbi.core.exceptions.InvalidObjectId;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;

import java.util.Date;

@Aggregate
@Slf4j
public class OwnerAggregate {
    @Getter
    @AggregateIdentifier
    private String ownerId;
    @Getter
    private String name;
    @Getter
    private Date birthDate;
    @Getter
    private String email;


    public OwnerAggregate() {
    }

    @CommandHandler
    public OwnerAggregate(CreateOwnerCommand command) {
        if(command.getCommandId() == null || command.getCommandId().isBlank()) throw new InvalidObjectId("Id can not be null.");
        AggregateLifecycle.apply(new OwnerCreatedEvent(
                command.getCommandId(),
                command.getName(),
                command.getBirthDate(),
                command.getEmail()
        ));
    }

    @EventSourcingHandler
    public void on(OwnerCreatedEvent event){
        this.ownerId = event.getId();
        this.birthDate = event.getBirthDate();
        this.name = event.getName();
        this.email = event.getEmail();
    }


    @CommandHandler
    public void handle(UpdateOwnerCommand command){
        log.error(command.getCommandId());
        if(command.getCommandId() == null || command.getCommandId().isBlank()) throw new InvalidObjectId("Id can not be null.");
        // validations
        AggregateLifecycle.apply(new OwnerUpdatedEvent(
                command.getCommandId(),
                command.getName(),
                command.getBirthDate(),
                command.getEmail()
        ));

    }

    @EventSourcingHandler
    public void on(OwnerUpdatedEvent event){
        this.ownerId = event.getId();
        this.birthDate = event.getBirthDate();
        this.name = event.getName();
        this.email = event.getEmail();
    }

    @CommandHandler
    public void handle(DeleteOwnerCommand command){
        // validations
        AggregateLifecycle.apply(new OwnerDeletedEvent(
                command.getCommandId()
        ));


    }

    @EventSourcingHandler
    public void on(OwnerDeletedEvent event){
        log.warn("Deleting Owner: "+ event.getId());
    }
}
