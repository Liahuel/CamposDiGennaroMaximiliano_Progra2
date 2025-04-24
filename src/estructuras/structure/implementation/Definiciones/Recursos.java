package estructuras.structure.implementation.Definiciones;

public class Recursos {
    private final Medico[] MedicosLista;
    private int medicosOcupados;
    private int medicosDisponibles;
    public Recursos() {
        MedicosLista = new Medico[10];
        this.medicosOcupados = 0;
        this.medicosDisponibles = 0;
    }
    public void mostrarMedicosDisponibles() {
        System.out.println("Medicos: ");
        for (int i = MedicosLista.length - 1; i >= 0; i--) {
            if(MedicosLista[i] != null) {
                if(MedicosLista[i].mostrarDisponibilidad()) {
                    System.out.println("Nombre: " + MedicosLista[i].mostrarNombre() +",Disponible");
                }

            }

        }
    }
    public void agregarMedico(Medico medico) {
        MedicosLista[medicosDisponibles]=medico;
        medicosDisponibles++;
    }
    public boolean estaVacio() {
        return MedicosLista.length==0;
    }
    public boolean ocuparMedico() {
        if(MedicosLista.length == 0) {
            System.out.println("no existen medicos, Agregue Medicos");
            return false;
        }
        if(medicosOcupados== medicosDisponibles) {
            System.out.println("Todos los medicos estan ocupados,Desocupe Medicos o agreguelos");
            return false;
        }else{
            MedicosLista[medicosDisponibles-1].cambiarDisponibilidad();
            medicosDisponibles--;
            medicosOcupados++;
            return true;
        }
    }
    public boolean desocuparMedico() {
        if(medicosOcupados>0){
            MedicosLista[medicosOcupados-1].cambiarDisponibilidad();
            medicosDisponibles++;
            medicosOcupados--;
            return true;
        }
        return false;

    }
}
