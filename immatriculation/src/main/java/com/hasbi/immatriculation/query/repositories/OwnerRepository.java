package com.hasbi.immatriculation.query.repositories;

import com.hasbi.immatriculation.query.entities.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner, String> {
}
