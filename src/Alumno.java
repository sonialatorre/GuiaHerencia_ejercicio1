public class Alumno extends Persona {

    protected String añoAcademico;
    public Alumno (){

    }

    public Alumno(String añoAcademico) {
        this.añoAcademico = añoAcademico;
    }

    public Alumno(String nombre, String apellido, int edad, String añoAcadémico) {
        super(nombre, apellido, edad);
        this.añoAcademico = añoAcadémico;
    }
    @Override
    public void Accion (){
         System.out.println ("estoy iniciando un nuevo año escolar");

    }


        @Override
    public void MostrarDatos(){
            System.out.println("El nombre del Alumno es: " + nombre + "\n"+ "el apellido es :" + apellido +"\n" + "su edad es: " + edad + "\n" + "El año académico es: " + añoAcademico);
        }



}





