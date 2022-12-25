package com.hasbi.infractions.query.services;

import com.hasbi.core.events.infractionEvents.InfractionCreatedEvent;
import com.hasbi.infractions.query.entities.Infraction;
import com.hasbi.infractions.query.repositories.InfractionRepository;
import lombok.AllArgsConstructor;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class InfractionEventHandlerService {
    private InfractionRepository infractionRepositor;

    @EventHandler
    public void on(InfractionCreatedEvent event){
        Infraction infraction = Infraction.builder()
                .id(event.getId())
                .date(event.getDate())
                .speed(event.getSpeed())
                .montant(event.getMontant())
                .vehiculeId(event.getVehiculeId())
                .radarId(event.getRadarId())
                .build();
        infractionRepositor.save(infraction);
    }
}
