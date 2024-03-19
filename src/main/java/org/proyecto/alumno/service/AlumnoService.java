package org.proyecto.alumno.service;

import org.proyecto.alumno.entity.Alumno;
import org.proyecto.alumno.repository.IAlumno;
import org.proyecto.alumno.request.AlumnoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AlumnoService implements IAlumnoService{

   @Autowired
   IAlumno dao;//para ocupar los metodos del repository

    @Override
    public Alumno guardar(AlumnoRequest request) {

        Alumno alumno = new Alumno();//creamos un objeto para manipular

        alumno.setNombre(request.getNombre());
        alumno.setEdad(request.getEdad());
        alumno.setGenero(request.getGenero());

        dao.save(alumno);
        return alumno;
    }

    @Override
    public Alumno editar(AlumnoRequest request) {

        Alumno alumno = dao.findById(request.getIdalumno()).get();

        alumno.setNombre(request.getNombre());
        alumno.setEdad(request.getEdad());
        alumno.setGenero(request.getGenero());

        dao.save(alumno);
        return alumno;
    }

    @Override
    public Alumno buscar(int id) {

        return dao.findById(id).get();
    }

    @Override
    public String eliminar(int id) {
        dao.deleteById(id);
        return "Registro eliminado";
    }

    @Override
    public List<Alumno> mostrar() {
        return dao.findAll();
    }
}
