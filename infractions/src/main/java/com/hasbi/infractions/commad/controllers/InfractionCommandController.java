package com.hasbi.infractions.commad.controllers;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import com.hasbi.core.commands.infractionCommands.*;
import com.hasbi.core.dtos.infractionDtos.*;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.axonframework.eventsourcing.eventstore.EventStore;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping("/commands/infraction")
public class InfractionCommandController {
    private CommandGateway commandGateway;
    private EventStore eventStore;

    @PostMapping("create")
    public CompletableFuture<String> createInfraction(@RequestBody CreateInfractionRequestDTO createInfractionRequestDTO){
        return commandGateway.send(new CreateInfractionCommand(
                UUID.randomUUID().toString(),
                createInfractionRequestDTO.getDate(),
                createInfractionRequestDTO.getSpeed(),
                createInfractionRequestDTO.getMontant(),
                createInfractionRequestDTO.getVehiculeId(),
                createInfractionRequestDTO.getRadarId()
        ));
    }

    @PutMapping("update/{id}")
    public CompletableFuture<String> updateInfraction(@RequestBody UpdateInfractionRequestDTO updateInfractionRequestDTO, @PathVariable String id){
        return commandGateway.send(new UpdateInfractionCommand(
                id,
                updateInfractionRequestDTO.getDate(),
                updateInfractionRequestDTO.getSpeed(),
                updateInfractionRequestDTO.getMontant(),
                updateInfractionRequestDTO.getVehiculeId(),
                updateInfractionRequestDTO.getRadarId()
        ));
    }

    @DeleteMapping("delete/{id}")
    public CompletableFuture<String> deleteInfraction(@PathVariable String id){
        return commandGateway.send(new DeleteInfractionCommand(id));
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> exceptionHandler(Exception exception){
        ResponseEntity<String> responseEntity = new ResponseEntity<>(
                exception.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR
        );

        return responseEntity;
    }

    @GetMapping("/eventStore/{radar_id}")

    public Stream eventStore(@PathVariable String radar_id){
        return eventStore.readEvents(radar_id).asStream();
    }


}
