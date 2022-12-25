package com.hasbi.core.dtos.vehicleDtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UpdateVehicleRequestDTO {
    private String num_matricule;
    private String marque;
    private int model;
    private float puissance_fiscal;
}
