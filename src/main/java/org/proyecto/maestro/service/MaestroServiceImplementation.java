package org.proyecto.maestro.service;

import org.proyecto.maestro.dto.MaestroDTO;
import org.proyecto.maestro.entity.MaestroEntity;
import org.proyecto.maestro.repository.MaestroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaestroServiceImplementation implements IMaestroService {

    @Autowired
    MaestroRepository dao;

    @Override
    public MaestroEntity guardar(MaestroDTO request) {

         MaestroEntity teacher = new MaestroEntity();

         teacher.setNombre(request.getNombre());
         teacher.setEdad(request.getEdad());
         teacher.setGenero(request.getGenero());

         dao.save(teacher);
        return teacher;
    }

    @Override
    public MaestroEntity editar(MaestroDTO request) {

      MaestroEntity teacher = dao.findById(request.getIdmaestro()).get();

      teacher.setNombre(request.getNombre());
      teacher.setEdad(request.getEdad());
      teacher.setGenero(request.getGenero());

      dao.save(teacher);
        return teacher;
    }

    @Override
    public MaestroEntity buscar(int id) {
        return dao.findById(id).get() ;
    }

    @Override
    public String eliminar(int id) {
       dao.deleteById(id);
        return "Refistro eliminado";
    }

    @Override
    public List<MaestroEntity> mostrar() {
        return dao.findAll();
    }
}
