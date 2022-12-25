package com.hasbi.radar.query.services;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import com.hasbi.core.exceptions.RadarNotFoundException;
import com.hasbi.core.queries.radarQueries.GetAllRadarsQuery;
import com.hasbi.core.queries.radarQueries.GetRadarByIdQuery;
import com.hasbi.radar.query.entities.Radar;
import com.hasbi.radar.query.repositories.RadarRepository;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
@NoArgsConstructor
public class RadarQueryHandlerService {
    private RadarRepository radarRepository;

    @QueryHandler
    public List<Radar> handle(GetAllRadarsQuery query){
        return radarRepository.findAll();
    }

    @QueryHandler
    public Radar handle(GetRadarByIdQuery query){
        return radarRepository.findById(query.getRadarId()).orElseThrow(()-> new RadarNotFoundException(String.format("Radar with ID [%s] not found.", query.getRadarId())));
    }
}
