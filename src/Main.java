import estructuras.structure.implementation.Definiciones.Medico;
import estructuras.structure.implementation.Definiciones.Paciente;
import estructuras.tp.Reportes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Reportes reporte=new Reportes();
        //Pacientes ya creados:
        reporte.agregarPaciente(new Paciente("Ana", 1));
        reporte.agregarPaciente(new Paciente("Luis", 2));
        reporte.agregarPaciente(new Paciente("María", 2));
        reporte.agregarPaciente(new Paciente("Carlos", 1));
        reporte.agregarPaciente(new Paciente("Elena", 3));
        reporte.agregarPaciente(new Paciente("Jorge", 3));
        reporte.agregarPaciente(new Paciente("Lucía", 2));
        reporte.agregarPaciente(new Paciente("Pedro", 2));
        reporte.agregarPaciente(new Paciente("Sofía", 3));
        reporte.agregarPaciente(new Paciente("Martín", 1));

        reporte.agregarMedico(new Medico("Fabaloro"));
        reporte.agregarMedico(new Medico("Eduardo"));
        reporte.agregarMedico(new Medico("Diogenes"));


        int opcion;
        do {

            System.out.println("\n--- Menú de Pacientes ---");
            System.out.println("1. Agregar paciente");
            System.out.println("2. Atender paciente");
            System.out.println("3. Agregar Medico");
            System.out.println("4. retirar paciente");
            System.out.println("5. Mostrar Pacientes");
            System.out.println("6.Estado Actual");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del paciente: ");
                    String nombre = sc.nextLine();
                    int prioridad = 0;
                    while (prioridad < 1 || prioridad > 3) {
                        System.out.print("Nivel de prioridad (3 menor prioridad y 1 mayor prioridad): ");
                        prioridad = sc.nextInt();
                    }
                    sc.nextLine(); // limpiar buffer
                    reporte.agregarPaciente(new Paciente(nombre, prioridad));
                    break;

                case 2:
                    reporte.atenderPaciente();
                    break;

                case 3:
                    System.out.print("Nombre del Medico: ");
                    String nombreMedico = sc.nextLine();
                     reporte.agregarMedico(new Medico(nombreMedico));
                    break;
                case 4:
                    reporte.RetirarPacienteAtendido();
                    break;
                case 5:
                    reporte.darReportes();
                    break;
                case 6:
                    reporte.datosActuales();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}