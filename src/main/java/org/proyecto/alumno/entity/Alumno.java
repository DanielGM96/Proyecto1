package org.proyecto.alumno.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name ="AlUMNO")
public class Alumno implements Serializable {

    public static final long SerialVersionUID = 1L;
     @Id
     @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="aid_auto")
     @SequenceGenerator(name = "aid_auto", sequenceName = "AlUMNO_SEC", allocationSize = 1)
     @Column(name = "ID_ALUMNO", columnDefinition = "NUMBER")
    private int idalumno;

     @Column(name = "NOMBRE", columnDefinition = "NVARCHAR2(30)")
    private String nombre;

    @Column(name = "EDAD", columnDefinition = "NUMBER")
    private int edad;

    @Column(name = "GENERO", columnDefinition = "NVARCHAR2(30)")
    private String genero;

  public Alumno(){

  }
    public Alumno(int idalumno) {
      super();
      this.idalumno = idalumno;
    }

    public int getIdalumno() {

      return idalumno;
    }

    public void setIdalumno(int idalumno) {

      this.idalumno = idalumno;
    }

    public String getNombre() {

      return nombre;
    }

    public void setNombre(String nombre) {

      this.nombre = nombre;
    }

    public int getEdad() {

      return edad;
    }

    public void setEdad(int edad) {

      this.edad = edad;
    }

    public String getGenero() {

      return genero;
    }

    public void setGenero(String genero) {

      this.genero = genero;
    }

    public static long getSerialVersionuid(){

      return SerialVersionUID;
    }
}
