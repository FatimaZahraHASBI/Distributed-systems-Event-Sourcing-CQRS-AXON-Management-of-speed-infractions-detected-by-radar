package com.hasbi.core.dtos.infractionDtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UpdateInfractionRequestDTO {
    private Date date;
    private double speed;
    private double montant;
    private String vehiculeId;
    private String radarId;
}
