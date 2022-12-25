package com.hasbi.core.dtos.radarDtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class UpdateRadarRequestDTO {
    private double speed_limit;
    private float longitude;
    private  float latitude;
}


