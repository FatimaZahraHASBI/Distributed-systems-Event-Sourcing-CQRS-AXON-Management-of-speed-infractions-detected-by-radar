package com.hasbi.infractions.query.services;

import com.hasbi.core.exceptions.OwnerNotFoundException;
import com.hasbi.core.queries.ownerQueries.GetAllOwnersQuery;
import com.hasbi.core.queries.ownerQueries.GetOwnerByIdQuery;
import com.hasbi.infractions.query.entities.Infraction;
import com.hasbi.infractions.query.repositories.InfractionRepository;
import lombok.AllArgsConstructor;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InfractionQueryHandlerService {
    private InfractionRepository infractionRepository;

    @QueryHandler
    public List<Infraction> handle(GetAllOwnersQuery query){
        return infractionRepository.findAll();
    }

    @QueryHandler
    public Infraction handle(GetOwnerByIdQuery query){
        return infractionRepository.findById(query.getId()).orElseThrow(()-> new OwnerNotFoundException(""));
    }

}
