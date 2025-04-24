package estructuras.structure.implementation.Definiciones;

public class Paciente {
    // Atributos
    private final String nombre;
    private final int nivelDePrioridad;
    private boolean pacienteAtendido;

    // Constructor
    public Paciente(String nombre, int nivelDePrioridad) {
        this.nombre = nombre;
        this.nivelDePrioridad = nivelDePrioridad;
        this.pacienteAtendido = false;
    }

    // Método para ver el nivel de prioridad
    public int verNivelDePrioridad() {
        return nivelDePrioridad;
    }

    // Método para verificar si el paciente fue atendido
    public boolean estaAtendido() {
        return pacienteAtendido;
    }
    // Método para cambiar si el paciente a pacienteatendido
    public void AtenderPaciente() {
        this.pacienteAtendido = true;
    }

    // Método para mostrar el nombre del paciente
    public String mostrarNombrePaciente() {
        return nombre;
    }
}