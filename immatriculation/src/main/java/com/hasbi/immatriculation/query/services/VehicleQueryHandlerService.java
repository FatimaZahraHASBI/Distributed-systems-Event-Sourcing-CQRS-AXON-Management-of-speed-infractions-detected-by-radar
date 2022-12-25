package com.hasbi.immatriculation.query.services;

import lombok.AllArgsConstructor;
import com.hasbi.core.exceptions.OwnerNotFoundException;
import com.hasbi.immatriculation.query.entities.Vehicle;
import com.hasbi.immatriculation.query.repositories.VehicleRepository;
import com.hasbi.core.queries.vehicleQueries.*;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class VehicleQueryHandlerService {
    private VehicleRepository vehicleRepository;

    @QueryHandler
    public List<Vehicle> handle(GetAllVehiclesQuery query){
        return vehicleRepository.findAll();
    }

    @QueryHandler
    public Vehicle handle(GetVehicleByIdQuery query){
        return vehicleRepository.findById(query.getId()).orElseThrow(()-> new OwnerNotFoundException(""));
    }
}
