package estructuras.tp;
import estructuras.structure.implementation.Definiciones.Medico;
import estructuras.structure.implementation.Definiciones.Paciente;
import estructuras.structure.implementation.Definiciones.Pacientes;
import estructuras.structure.implementation.Definiciones.Recursos;

public class Reportes {
    private final Pacientes pacientesParaAtender;
    private final Recursos recursos;
    private final Pacientes pacientesAtendidos;
    private final Pacientes pacientesParaReportes;
    public  Reportes(){
        pacientesAtendidos = new Pacientes();
        pacientesParaAtender = new Pacientes();
        pacientesParaReportes=new Pacientes();
        recursos = new Recursos();
    }
    public void darReportes(){
        System.out.println("pacientes para atender");
        pacientesParaAtender.mostrarPacientes();
        System.out.println("pacientes en Atencion");
        pacientesAtendidos.mostrarPacientes();
        System.out.println("pacientes ya atendidos");
        pacientesParaReportes.mostrarPacientes();
    }
    public void datosActuales(){
        System.out.println("pacientes para atender");
        pacientesParaAtender.mostrarPacientes();
        recursos.mostrarMedicosDisponibles();
    }
    public void RetirarPacienteAtendido(){

        if(this.recursos.desocuparMedico()) {
            System.out.println("se retira el paciente: "+ pacientesAtendidos.verPacienteActual().mostrarNombrePaciente());
            this.pacientesParaReportes.agregarPaciente(pacientesAtendidos.verPacienteActual());
            this.pacientesAtendidos.eliminarPaciente();
            return;
        }
        if(pacientesAtendidos.estaVacia()){
            System.out.println("Paciente no encontrados (es posible que haya pacientes para atender)");
            return;
        }
        if(!recursos.estaVacio()){
            System.out.println("Medicos no encontrados");
        }

    }
    public void agregarPaciente(Paciente paciente){
        pacientesParaAtender.agregarPaciente(paciente);
    }
    public void agregarMedico(Medico medico){
        recursos.agregarMedico(medico);
    }
    public void atenderPaciente(){
        if(this.pacientesParaAtender.verPacienteActual() != null){
            if(this.recursos.ocuparMedico()){
                pacientesAtendidos.agregarPaciente(this.pacientesParaAtender.verPacienteActual());
                pacientesParaAtender.eliminarPaciente();
            }
        }
    }
}
