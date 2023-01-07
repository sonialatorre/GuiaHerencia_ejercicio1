public class Profesor extends Persona {

    protected String Materia;



    public Profesor() {
    }

    public Profesor(String materia) {
        Materia = materia;
    }

    public Profesor(String nombre, String apellido, int edad, String materia) {
        super(nombre, apellido, edad);
        Materia = materia;
    }
    @Override
    public void Accion(){
        System.out.println ("Soy la profesora Diana y estoy iniciando un nuevo año escolar");
    }
    public void MostrarDatos(){
        System.out. println ("La materia que dictaré es " + Materia);
    }
}

