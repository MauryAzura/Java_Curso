package Encapsulamiento;

public class Alumno {
    

    private int id;
    private String nombre;
    private String apellido;


    //Constructor con datos

    public Alumno(int id, String nombre, String apellido){

        this.id =  id;
        this.nombre = nombre;
        this.apellido = apellido;

    }

    //Constructor vacio

    public Alumno(){



    }

    //Getters and Setter

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    //Otras funciones

    public void mostrarNombre(){

        System.out.println("Hola soy un alumno y se decir mi nombre");

    }


    public void aprobado(double calificacion){


        if(calificacion>=6){

            System.out.println("Aprobado");

        }else{

            System.out.println("Reprobado");

        }

    }

}
