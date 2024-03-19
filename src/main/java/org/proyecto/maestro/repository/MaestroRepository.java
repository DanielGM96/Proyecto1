package org.proyecto.maestro.repository;

import org.proyecto.maestro.entity.MaestroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaestroRepository extends JpaRepository <MaestroEntity, Integer> {
}
