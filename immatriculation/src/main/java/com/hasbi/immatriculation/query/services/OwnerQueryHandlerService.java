package com.hasbi.immatriculation.query.services;

import lombok.AllArgsConstructor;
import com.hasbi.core.exceptions.OwnerNotFoundException;
import com.hasbi.immatriculation.query.entities.Owner;
import com.hasbi.immatriculation.query.repositories.OwnerRepository;
import com.hasbi.core.queries.ownerQueries.*;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OwnerQueryHandlerService {
    private OwnerRepository ownerRepository;

    @QueryHandler
    public List<Owner> handle(GetAllOwnersQuery query){
        return ownerRepository.findAll();
    }

    @QueryHandler
    public Owner handle(GetOwnerByIdQuery query){
        return ownerRepository.findById(query.getId()).orElseThrow(()-> new OwnerNotFoundException(""));
    }
}
