package com.hasbi.infractions.query.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Infraction {
    @Id
    private String id;
    private Date date;
    private double speed;
    private double montant;
    private String vehiculeId;
    private String radarId;
}
