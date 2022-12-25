package com.hasbi.infractions.query.controlles;

import com.hasbi.core.queries.ownerQueries.GetAllOwnersQuery;
import com.hasbi.core.queries.ownerQueries.GetOwnerByIdQuery;
import com.hasbi.infractions.query.entities.Infraction;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@NoArgsConstructor
@RequestMapping("/query/infractions")
public class InfractionQueryController {
    private QueryGateway queryGateway;

    @GetMapping("")
    public List<Infraction> getAllInfractions(){
        List<Infraction> infractions = queryGateway.query(new GetAllOwnersQuery(), ResponseTypes.multipleInstancesOf(Infraction.class)).join();
        return  infractions;
    }

    @GetMapping("/{id}")
    public Infraction getInfractionById(@PathVariable String id){
        Infraction infraction = queryGateway.query(new GetOwnerByIdQuery(id), ResponseTypes.instanceOf(Infraction.class)).join();
        return  infraction;
    }

    //@ExceptionHandler(Exception.class)
    public ResponseEntity<String> exceptionHandler(Exception exception){
        ResponseEntity<String> responseEntity = new ResponseEntity<>(
                exception.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR
        );

        return responseEntity;
    }


}
