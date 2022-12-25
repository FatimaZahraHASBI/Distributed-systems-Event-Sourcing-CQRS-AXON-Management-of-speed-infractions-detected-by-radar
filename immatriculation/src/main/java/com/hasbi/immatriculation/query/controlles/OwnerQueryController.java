package com.hasbi.immatriculation.query.controlles;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import com.hasbi.immatriculation.query.entities.Owner;
import com.hasbi.core.queries.ownerQueries.*;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/query/owners")
public class OwnerQueryController {
    @Autowired
    private QueryGateway queryGateway;

    @GetMapping("")
    public List<Owner> getAllOwners(){
        List<Owner> owners = queryGateway.query(new GetAllOwnersQuery(), ResponseTypes.multipleInstancesOf(Owner.class)).join();
        return  owners;
    }

    @GetMapping("/{id}")
    public Owner getOwnerById(@PathVariable String id){
        Owner owner = queryGateway.query(new GetOwnerByIdQuery(id), ResponseTypes.instanceOf(Owner.class)).join();
        return  owner;
    }

    //@ExceptionHandler(Exception.class)
    public ResponseEntity<String> exceptionHandler(Exception exception){
        ResponseEntity<String> responseEntity = new ResponseEntity<>(
                exception.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR
        );

        return responseEntity;
    }
}
