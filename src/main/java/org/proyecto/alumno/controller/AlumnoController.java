package org.proyecto.alumno.controller;
import org.proyecto.alumno.entity.Alumno;
import org.proyecto.alumno.request.AlumnoRequest;
import org.proyecto.alumno.service.AlumnoService;
import org.proyecto.alumno.service.IAlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Alumno")
public class AlumnoController {

    @Autowired
    IAlumnoService service;

    //http://localhost:8090/Alumno/mostrar
  @GetMapping("mostrar")
    public ResponseEntity <List<Alumno>> mostrar(){

      List<Alumno> lista = service.mostrar();

  return new ResponseEntity<List<Alumno>>(lista, HttpStatus.OK);
  }

  @PostMapping("guardar")
    public ResponseEntity<Alumno> guardar (@RequestBody AlumnoRequest request){

      Alumno alumno = service.guardar(request);
      return new ResponseEntity<Alumno>(alumno,HttpStatus.OK);
  }

  @PutMapping("editar")
    public ResponseEntity<Alumno> editar (@RequestBody AlumnoRequest request){

      Alumno alumno = service.editar(request);
      return new ResponseEntity<Alumno>(alumno,HttpStatus.OK);
  }

  @GetMapping("buscar/{id}")
    public  ResponseEntity<Alumno> buscar (@PathVariable int id){

      Alumno alumno = service.buscar(id);
      return new ResponseEntity<Alumno>(alumno,HttpStatus.OK);
  }

  @DeleteMapping("eliminar/{id}")
    public  ResponseEntity<String> eliminar (@PathVariable int id){

      String alumno = service.eliminar(id);
      return new ResponseEntity<String>(alumno,HttpStatus.OK);

  }
}
