package ar.org.centro8.dispositivos.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="dispositivos")
public class Dispositivo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer id;
    private String fecha;
    private String nombre;
    //@Column(name="cursos")
    private String curso;
    private String turno;
    private String aula;
    private String bien;
    private String marca;
    //@Transient
    private String observaciones;
    
    public Dispositivo() {
    }

    public Dispositivo(String fecha, String nombre, String curso, String turno, String aula, String bien, String marca,
            String observaciones) {
        this.fecha = fecha;
        this.nombre = nombre;
        this.curso = curso;
        this.turno = turno;
        this.aula = aula;
        this.bien = bien;
        this.marca = marca;
        this.observaciones = observaciones;
    }

    public Dispositivo(Integer id, String fecha, String nombre, String curso, String turno, String aula, String bien,
            String marca, String observaciones) {
        this.id = id;
        this.fecha = fecha;
        this.nombre = nombre;
        this.curso = curso;
        this.turno = turno;
        this.aula = aula;
        this.bien = bien;
        this.marca = marca;
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "Dispositivo [id=" + id + ", fecha=" + fecha + ", nombre=" + nombre + ", curso=" + curso + ", turno="
                + turno + ", aula=" + aula + ", bien=" + bien + ", marca=" + marca + ", observaciones=" + observaciones
                + "]";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getBien() {
        return bien;
    }

    public void setBien(String bien) {
        this.bien = bien;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

}
