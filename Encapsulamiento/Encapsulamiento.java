package Encapsulamiento;

public class Encapsulamiento {
    
    public static void main(String[] args) {
        
        Alumno a1 = new Alumno();
        Alumno a2 = new Alumno(1,"Mauricio","Sandoval");

        System.out.println("id:"+a2.getId());
        System.out.println("Nombre:"+a2.getNombre());
        System.out.println("Apellido:"+a2.getApellido());

    }

}
