

public class Foreach {
    
    
    public static void main(String[] args) {
        
        String[] name = {"Mau","Luis","Jose","Pedro","Luisa"};

        //Usando lenght

        for(int i=0;i<name.length;i++){

            System.out.println(name[i]);
        
        }

        //Usando foreach

        System.out.println("-----------Foreach------------");

        for(String i: name){

            System.out.println(i);

        }

    }

}
