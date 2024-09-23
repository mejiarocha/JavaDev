package com.emp.jamr.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Empleado") // Asegúrate de que el nombre de la tabla coincide con la base de datos
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Para manejar el campo identity
    @Column(name = "IdEmpleado") // Mapeo explícito de la columna
    private int idEmpleado;

    @Column(name = "Correo") // Mapeo explícito de la columna
    private String correo;

    @Column(name = "Nombre") // Mapeo explícito de la columna
    private String nombre;

    @Column(name = "Sueldo") // Mapeo explícito de la columna
    private int sueldo;

    public Empleado(String correo, String nombre, int sueldo) {
        super();
        this.correo = correo;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public Empleado() {

    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

}
