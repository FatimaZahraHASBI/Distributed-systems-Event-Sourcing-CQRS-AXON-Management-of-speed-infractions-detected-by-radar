package com.hasbi.core.queries.vehicleQueries;

import lombok.Getter;

public class GetVehicleByIdQuery {
    @Getter
    private String id;

    public GetVehicleByIdQuery(String radarId) {
        this.id = radarId;
    }
}
