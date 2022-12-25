package com.hasbi.radar.query.services;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import com.hasbi.radar.query.repositories.RadarRepository;
import com.hasbi.core.events.radarEvents.*;
import com.hasbi.radar.query.entities.Radar;
import com.hasbi.core.exceptions.RadarNotFoundException;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor @NoArgsConstructor
public class RadarEventHandlerService {
    private RadarRepository radarRepository;

    @EventHandler
    public Radar on(RadarCreatedEvent event){
        log.info("#==> RadarCreatedEvent Received");
        Radar radar = Radar.builder()
                .radarId(event.getId())
                .speed_limit(event.getSpeed_limit())
                .longitude(event.getLongitude())
                .latitude(event.getLatitude())
                .build();
        System.out.println(radar);
        log.info("#==> Radar saved");
        return radarRepository.save(radar);
    }

    @EventHandler
    public Radar on(RadarUpdatedEvent event){
        log.info("#==> RadarUpdatedEvent Received");
        Radar radar = radarRepository.findById(event.getId()).orElseThrow(()-> new RadarNotFoundException(String.format("Radar with ID [%s] Not Found !", event.getId())));
        radar.setSpeed_limit(event.getSpeed_limit());
        radar.setLongitude(event.getLongitude());
        radar.setLatitude(event.getLatitude());

        return radarRepository.save(radar);
    }

    @EventHandler
    public void on(RadarDeletedEvent event){
        log.info("RadarDeletedEvent Received");
        Radar radar = radarRepository.findById(event.getId()).orElseThrow(()-> new RadarNotFoundException(String.format("Radar with ID [%s] Not Found !", event.getId())));
        radarRepository.deleteById(radar.getRadarId());
    }
}
