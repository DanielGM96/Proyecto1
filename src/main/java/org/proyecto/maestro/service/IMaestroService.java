package org.proyecto.maestro.service;


import org.proyecto.maestro.dto.MaestroDTO;
import org.proyecto.maestro.entity.MaestroEntity;

import java.util.List;

public interface IMaestroService {

    public MaestroEntity guardar (MaestroDTO request);
    public MaestroEntity editar (MaestroDTO request);
    public MaestroEntity buscar (int id);
    public String eliminar (int id);
    public List<MaestroEntity> mostrar();




}
