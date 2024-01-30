import javax.swing.JOptionPane;

public class mostrarn {
    
    public static void main(String[] args) {
        
        long i,x=Long.parseLong(JOptionPane.showInputDialog("Ingresa hasta que numero quieres imprimir:"));


        for(i=1;i<=x;i++){

            System.out.println(i);

        }



    }

}
