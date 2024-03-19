package org.proyecto.alumno.request;

import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class AlumnoRequest {

    private int idalumno;
    private String nombre;
    private int edad;
    private String genero;


}
