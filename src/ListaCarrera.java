import java.util.ArrayList;
import java.util.List;

public class ListaCarrera {

    List<Carrera> carreras;
    List<Double> promedioNotas;
    List<Double> promedioEdades;
    public ListaCarrera() {
        carreras = new ArrayList<>();
        carreras.add(new Carrera(101, "Ingeniería de Sistemas"));
        carreras.add(new Carrera (102, "Ingeniería Industrial"));
        carreras.add(new Carrera (103, "Matemáticas"));
        promedioNotas= new ArrayList<>();
        promedioEdades= new ArrayList<>();
        calcularPromedio();
    }
    public void calcularPromedio(){
        for(Carrera carrera: carreras){
            double sumaNotas=0;
            double sumaEdades=0;
            int cont=0;

            for(Estudiante estudiante: new ListaEstudiante().estudiantes){
                if (estudiante.carrera== carrera.codigo){
                    sumaNotas=sumaNotas+estudiante.promedio;
                    sumaEdades=sumaEdades+estudiante.edad;
                    cont++;
                }

            }
                double promNotas=sumaNotas/cont;
                double promEdades=sumaEdades/cont;
                promedioNotas.add(promNotas);
                promedioEdades.add(promEdades);

        }
    }
    public void reporte(){
        for(int i=0; i<carreras.size();i++){
            System.out.println("Carrera            : "+carreras.get(i).nombre);
            System.out.println("Primedio de notas  : "+promedioNotas.get(i));
            System.out.println("Promedio de edades : "+promedioEdades.get(i));
            System.out.println("--------------------------");
        }
    }

}
