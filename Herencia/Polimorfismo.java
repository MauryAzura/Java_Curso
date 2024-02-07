package Herencia;

public class Polimorfismo {

    public static void main(String[] args) {
        
        Persona vector[] = new Persona[5];

        //Clase madre
        vector[0]= new Persona();
        //Clases hijas
        vector[1]= new Empleado();
        vector[2]= new Consultor();
        vector[3]= new jefe();

        //Asignaciones

        Persona person = new Persona();
        Consultor consul = new Consultor();

        person = consul;

    }

}