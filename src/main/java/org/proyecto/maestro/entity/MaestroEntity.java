package org.proyecto.maestro.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="maestro")
public class MaestroEntity implements Serializable {

    public static final long SerialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "aid_auto")
    @SequenceGenerator(name = "aid_auto", sequenceName = "maestro_sec", allocationSize = 1)
    @Column(name = "id_maestro", columnDefinition = "number")
    private int idmaestro;

    @Column(name = "nombre", columnDefinition = "nvarchar2(30)")
    private String nombre;

    @Column(name = "edad", columnDefinition = "number")
    private int edad;

    @Column(name = "genero", columnDefinition = "nvarchar2(30)")
    private  String genero;

    public MaestroEntity(){

    }

    public MaestroEntity(int idmaestro) {
        super();
        this.idmaestro = idmaestro;
    }

    public int getIdmaestro() {
        return idmaestro;
    }

    public void setIdmaestro(int idmaestro) {
        this.idmaestro = idmaestro;
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
