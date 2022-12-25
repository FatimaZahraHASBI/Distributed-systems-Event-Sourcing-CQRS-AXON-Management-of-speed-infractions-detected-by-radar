package com.hasbi.radar.query.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Radar {
    @Id
    private String radarId;
    private double speed_limit;
    private float longitude;
    private  float latitude;
}
