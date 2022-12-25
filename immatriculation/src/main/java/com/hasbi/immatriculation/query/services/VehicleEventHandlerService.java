package com.hasbi.immatriculation.query.services;

import lombok.AllArgsConstructor;
import com.hasbi.core.events.ownerEvents.*;
import com.hasbi.core.events.vehicleEvents.*;
import com.hasbi.core.exceptions.VehicleNotFoundException;
import com.hasbi.immatriculation.query.entities.Vehicle;
import com.hasbi.immatriculation.query.repositories.VehicleRepository;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class VehicleEventHandlerService {
    private VehicleRepository vehicleRepository;

    @EventHandler
    public void on(VehicleCreatedEvent event){
        Vehicle vehicle = Vehicle.builder()
                .id(event.getId())
                .marque(event.getMarque())
                .model(event.getModel())
                .num_matricule(event.getNum_matricule())
                .puissance_fiscal(event.getPuissance_fiscal())
                .build();
        vehicleRepository.save(vehicle);
    }

    @EventHandler
    public void on(VehicleUpdatedEvent event){

        Vehicle vehicle = vehicleRepository.findById(event.getId()).orElseThrow(()-> new VehicleNotFoundException(""));
        vehicle.setId(event.getId());
        vehicle.setMarque(event.getMarque());
        vehicle.setModel(event.getModel());
        vehicle.setNum_matricule(event.getNum_matricule());
        vehicle.setPuissance_fiscal(event.getPuissance_fiscal());

        vehicleRepository.save(vehicle);
    }


    @EventHandler
    public void on(OwnerDeletedEvent event){

        Vehicle vehicle = vehicleRepository.findById(event.getId()).orElseThrow(()-> new VehicleNotFoundException(""));

        vehicleRepository.delete(vehicle);
    }
}
