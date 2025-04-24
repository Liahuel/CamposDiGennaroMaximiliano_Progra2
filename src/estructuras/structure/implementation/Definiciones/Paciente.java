package estructuras.structure.implementation.Definiciones;

public class Paciente {
    // Atributos
    private final String nombre;
    private final int nivelDePrioridad;


    public Paciente(String nombre, int nivelDePrioridad) {
        this.nombre = nombre;
        this.nivelDePrioridad = nivelDePrioridad;
    }


    public int verNivelDePrioridad() {
        return nivelDePrioridad;
    }


    public String mostrarNombrePaciente() {
        return nombre;
    }
}