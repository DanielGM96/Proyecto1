package org.proyecto.alumno.repository;

import org.proyecto.alumno.entity.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAlumno extends JpaRepository <Alumno,Integer> {
}
