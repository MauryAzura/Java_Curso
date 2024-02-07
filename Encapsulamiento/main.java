package Encapsulamiento;

import javax.swing.JOptionPane;

public class main {
    
    public static void main(String[] args) {
        

        Alumno a1 = new Alumno();

        a1.setId(56);
        a1.setNombre(JOptionPane.showInputDialog("Ingresa tu nombre:"));
        a1.setApellido(JOptionPane.showInputDialog("Ingresa tu Apellido:"));

        System.out.println("La id es "+a1.getId());
        System.out.println("El nombre es "+a1.getNombre());
        System.out.println("El apellido es "+a1.getApellido());

    }

}
