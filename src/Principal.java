
public class Principal {
    public static void main(String[] args) {

        ListaEstudiante listaEstudiante = new ListaEstudiante();
        ListaCarrera listaCarrera =new ListaCarrera();
        // Mostrar la información de todos los estudiantes
        System.out.println("INFORMACION DE LOS ESTUDIANTES:");
        for (Estudiante estudiante : listaEstudiante.estudiantes) {
            System.out.println(estudiante);
        }
        System.out.println("\nINFROMACION DE LAS CARRERAS:");
        for (Carrera carrera : listaCarrera.carreras){
            System.out.println(carrera);
        }
//Completar
        System.out.println("\nREPORTE:\n ");
        listaCarrera.reporte();
    }
}

