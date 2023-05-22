package cola;

import java.util.ArrayList;

public class Persona<boletos>{

    private String nombre;
    private ArrayList<boletos> boletos;

    // Constructor por defecto
    public Persona() {
        this.nombre = "";
        this.boletos = new ArrayList<>();
    }

    // Constructor con parámetros
    public Persona(String nombre, ArrayList<boletos> boletos) {
        this.nombre = nombre;
        this.boletos = boletos;
    }

    // Métodos getters y setters para la propiedad nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos getters y setters para la propiedad boletos
    public ArrayList<boletos> getBoletos() {
        return boletos;
    }

    public void setBoletos(ArrayList<boletos> boletos) {
        this.boletos = boletos;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", boletos=" + boletos.get(0).toString() + '}';
    }

}
