public abstract class Persona {

    protected String nombre;
    protected String apellido;
    protected int edad;

    public Persona (){

    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    public abstract void Accion();
    public void MostrarDatos(){
        System.out.println("el nombre del Alumno es: " + nombre + "\n"+ "el apellido es :" + apellido +"\n" + "su edad es: " + edad);
    }

}
