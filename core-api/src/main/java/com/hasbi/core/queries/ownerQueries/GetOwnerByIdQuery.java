package com.hasbi.core.queries.ownerQueries;

import lombok.Getter;

public class GetOwnerByIdQuery {
    @Getter
    private String id;

    public GetOwnerByIdQuery(String id) {
        this.id = id;
    }
}
