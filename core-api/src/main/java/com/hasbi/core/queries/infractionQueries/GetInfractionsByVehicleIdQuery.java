package com.hasbi.core.queries.infractionQueries;

import lombok.Getter;

public class GetInfractionsByVehicleIdQuery {
    @Getter
    private String id;

    public GetInfractionsByVehicleIdQuery(String id) {
        this.id = id;
    }
}
