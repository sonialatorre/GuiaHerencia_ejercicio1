public class Main {
    public static void main(String[] args) {
        Alumno alumno =new Alumno("Laura", "Perez", 12, "2023");
        alumno.Accion();
        alumno.MostrarDatos();

        Profesor profesor =new Profesor ("Español");
        profesor.Accion();
        profesor.MostrarDatos();

    }
}