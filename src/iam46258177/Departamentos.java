package iam46258177;

import java.io.Serializable;

public class Departamentos implements Serializable {
    private int departamento;
    private String nombre, localidad;

    public Departamentos(int departamento, String nombre, String localidad) {
        this.departamento = departamento;
        this.nombre = nombre;
        this.localidad = localidad;
    }

    public int getDepartamento() {
        return departamento;
    }

    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
}
