package com.hasbi.radar.query.repositories;

import com.hasbi.radar.query.entities.Radar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RadarRepository extends JpaRepository<Radar, String> {

}
