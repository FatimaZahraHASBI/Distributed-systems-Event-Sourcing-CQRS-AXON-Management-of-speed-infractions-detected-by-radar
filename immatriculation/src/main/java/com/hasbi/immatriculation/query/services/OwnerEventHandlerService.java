package com.hasbi.immatriculation.query.services;

import lombok.AllArgsConstructor;
import com.hasbi.core.events.ownerEvents.*;
import com.hasbi.core.exceptions.OwnerNotFoundException;
import com.hasbi.immatriculation.query.entities.Owner;
import com.hasbi.immatriculation.query.repositories.OwnerRepository;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OwnerEventHandlerService {
    private OwnerRepository ownerRepository;

    @EventHandler
    public void on(OwnerCreatedEvent event){
        Owner owner = Owner.builder()
                .id(event.getId())
                .birthDate(event.getBirthDate())
                .name(event.getName())
                .email(event.getEmail())
                .build();
        ownerRepository.save(owner);
    }

    @EventHandler
    public void on(OwnerUpdatedEvent event){

        Owner owner = ownerRepository.findById(event.getId()).orElseThrow(()-> new OwnerNotFoundException(""));
        owner.setId(event.getId());
        owner.setEmail(event.getEmail());
        owner.setBirthDate(event.getBirthDate());
        owner.setEmail(event.getEmail());
        ownerRepository.save(owner);
    }


    @EventHandler
    public void on(OwnerDeletedEvent event){

        Owner owner = ownerRepository.findById(event.getId()).orElseThrow(()-> new OwnerNotFoundException(""));

        ownerRepository.delete(owner);
    }
}
