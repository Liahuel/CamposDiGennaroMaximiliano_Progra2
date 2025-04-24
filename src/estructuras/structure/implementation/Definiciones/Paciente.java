package estructuras.structure.implementation.Definiciones;

public class Paciente {
    // Atributos
    private final String nombre;
    private final int nivelDePrioridad;
    private boolean pacienteAtendido;


    public Paciente(String nombre, int nivelDePrioridad) {
        this.nombre = nombre;
        this.nivelDePrioridad = nivelDePrioridad;
        this.pacienteAtendido = false;
    }


    public int verNivelDePrioridad() {
        return nivelDePrioridad;
    }

    public boolean estaAtendido() {
        return pacienteAtendido;
    }
    public void AtenderPaciente() {
        this.pacienteAtendido = true;
    }

    public String mostrarNombrePaciente() {
        return nombre;
    }
}