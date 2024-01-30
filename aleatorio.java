import javax.swing.JOptionPane;

public class aleatorio {

    public static void main(String[] args) {

        byte aleatorio = (byte) (Math.random()*100);
        byte c=0;
        byte n_i = 0;
        String m=" ";

        while(true){

            n_i = Byte.parseByte(JOptionPane.showInputDialog("---Adivina el numero--- \n"+m+"\n Ingresa un numero:"));

            if(n_i<aleatorio){

                m="El numero es mayor";
                c++;

            }else if(n_i>aleatorio){

                m="El numero es menor";
                c++;

            }else{

                JOptionPane.showMessageDialog(null,"Los has logrado el numero es "+aleatorio+" te ha tomado "+c+" intentos");
                break;
            }
        }


    }
}