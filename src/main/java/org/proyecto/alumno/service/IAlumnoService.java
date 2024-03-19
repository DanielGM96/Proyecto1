package org.proyecto.alumno.service;

import org.proyecto.alumno.entity.Alumno;
import org.proyecto.alumno.request.AlumnoRequest;

import java.util.List;

public interface IAlumnoService {

    public Alumno guardar (AlumnoRequest request);
    public Alumno editar (AlumnoRequest request);
    public Alumno  buscar (int id);
    public String eliminar (int id);
    public List<Alumno> mostrar();
}
