import javax.swing.JOptionPane;

public class cuadrado {
    
    public static void main(String[] args) {
        
        long c,n=1;

        while (true) {
            
            n=Long.parseLong(JOptionPane.showInputDialog("Ingresa un numero:"));
        
            if(n>0){

                c=(long)(Math.pow(n, 2));
                JOptionPane.showMessageDialog(null,"El cuadrado de "+n+" es "+c);

            }else{

                break;

            }

        }

    }

}
