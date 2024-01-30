import javax.swing.JOptionPane;

public class media {
    
    public static void main(String[] args) {

        double numero=0;
        double x=1;
        int c=0;


        while(x>0){

            c++;
            x=Double.parseDouble(JOptionPane.showInputDialog("Ingresa un numero:"));
            numero+=x;
            

        }
        if(numero==0){

            JOptionPane.showMessageDialog(null,"La division entre 0 no es posible");


        }else{
        numero/=(c-1);
        JOptionPane.showMessageDialog(null,"La media es: "+numero);
        }
    }

}
