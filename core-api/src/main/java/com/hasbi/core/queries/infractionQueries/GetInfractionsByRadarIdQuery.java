package com.hasbi.core.queries.infractionQueries;

import lombok.Getter;

public class GetInfractionsByRadarIdQuery {
    @Getter
    private String id;

    public GetInfractionsByRadarIdQuery(String id) {
        this.id = id;
    }
}
