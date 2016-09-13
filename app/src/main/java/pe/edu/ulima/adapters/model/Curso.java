package pe.edu.ulima.adapters.model;

/**
 * Created by sodm on 12/09/2016.
 */
public class Curso {
    public String nombre;
    public int creditos;

    public Curso(int creditos, String nombre) {
        this.creditos = creditos;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
}
