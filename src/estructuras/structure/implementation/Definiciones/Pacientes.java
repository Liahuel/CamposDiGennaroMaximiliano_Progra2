package estructuras.structure.implementation.Definiciones;
import estructuras.structure.implementation.Definiciones.Pacientes;

public class Pacientes {
    private static final int maximo = 10;
    private final Paciente[] cola;
    private int size;

    public Pacientes() {
        cola = new Paciente[maximo];
        size = 0;
    }

    public void agregarPaciente(Paciente p) {
        if (size == maximo) {
            System.out.println("La cola está llena.");
            return;
        }
        int i = size - 1;
        while (i >= 0 && cola[i].verNivelDePrioridad() < p.verNivelDePrioridad()) {
            cola[i + 1] = cola[i];
            i--;
        }
        cola[i + 1] = p;
        size++;
    }

    public void eliminarPaciente() {
        cola[size - 1]=null;
        size--;
    }

    public Paciente verPacienteActual() {
        if (estaVacia()) {
            System.out.println("No hay pacientes.");
            return null;
        }
        return cola[size - 1];
    }

    public boolean estaVacia() {
        return size == 0;
    }
    // pacientes 
    public void mostrarPacientes() {
        System.out.println("Pacientes: ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.println("Nombre: " + cola[i].mostrarNombrePaciente() +",Prioridad: " +cola[i].verNivelDePrioridad());
        }
    }
}