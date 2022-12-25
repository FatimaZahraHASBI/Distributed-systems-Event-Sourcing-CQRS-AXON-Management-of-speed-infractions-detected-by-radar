package com.hasbi.infractions.query.repositories;

import com.hasbi.infractions.query.entities.Infraction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InfractionRepository extends JpaRepository<Infraction, String> {
}
