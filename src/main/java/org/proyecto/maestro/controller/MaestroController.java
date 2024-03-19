package org.proyecto.maestro.controller;

import org.proyecto.maestro.dto.MaestroDTO;
import org.proyecto.maestro.entity.MaestroEntity;
import org.proyecto.maestro.service.IMaestroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("MaestroEntity")
public class MaestroController {

    @Autowired
    IMaestroService service;

    @GetMapping("mostrar")
    public ResponseEntity<List<MaestroEntity>> mostrar (){
        List<MaestroEntity> lista = service.mostrar();
        return new ResponseEntity<List<MaestroEntity>>(lista, HttpStatus.OK);
    }

    @PostMapping("guardar")
    public ResponseEntity<MaestroEntity> guardar (@RequestBody MaestroDTO request){
        MaestroEntity teacher = service.guardar(request);
        return  new ResponseEntity<MaestroEntity>(teacher,HttpStatus.OK);
    }

    @PutMapping("editar")
    public ResponseEntity<MaestroEntity> editar (@RequestBody MaestroDTO request){
        MaestroEntity teacher = service.editar(request);
        return new ResponseEntity<MaestroEntity>(teacher,HttpStatus.OK);
    }

    @GetMapping("buscar/{id}")
    public ResponseEntity<MaestroEntity> buscar (@PathVariable int id){
     MaestroEntity teacher =  service.buscar(id);
     return new ResponseEntity<MaestroEntity>(teacher,HttpStatus.OK);
    }

    @DeleteMapping("eliminar/{id}")
    public ResponseEntity<String> eliminar (@PathVariable int id){
        String teacher = service.eliminar(id);
        return new ResponseEntity<String>(teacher,HttpStatus.OK);
    }

}
