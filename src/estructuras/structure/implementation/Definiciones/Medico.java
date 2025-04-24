package estructuras.structure.implementation.Definiciones;

public class Medico {
    private final String nombre;
    private boolean disponibilidad;
    public Medico(String nombre) {
        this.nombre = nombre;
        this.disponibilidad = true;
    }
    public String mostrarNombre(){
        return nombre;
    }
    public boolean mostrarDisponibilidad() {
        return disponibilidad;
    }
    public void cambiarDisponibilidad() {
        disponibilidad = !disponibilidad;
    }

}
