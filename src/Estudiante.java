public class Estudiante {

        String nombre;
        int edad;
        int carrera;
        double promedio;


    public Estudiante(String nombre, int edad, int carrera, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCarrera() {
        return carrera;
    }

    public void setCarrera(int carrera) {
        this.carrera = carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        String nombreCarrera = obtenerNombreCarrera(carrera);
        return "\nEstudiante: "+
                "\nNombre    : "+nombre+
                "\nEdad      : "+edad+
                "\nCarrera   : "+nombreCarrera+
                "\nPromedio  : "+promedio+
                "\n---------------------------";
    }
    private String obtenerNombreCarrera(int codigoCarrera) {
        String nombreCarrera = "";
        for (Carrera carrera : new ListaCarrera().carreras) {
            if (carrera.codigo==codigoCarrera){
                nombreCarrera = carrera.nombre;
                break;
            }
        }
        return nombreCarrera;
    }
}
