package practicajava;
import java.util.Random;//numeros aleatorios.
import javax.swing.JOptionPane;//entrada y salida de datos en modal.
import java.util.Scanner;

public class PracticaJava {
    /*
        
    */
    static Random rand = new Random();
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        
  Scanner leer = new Scanner(System.in);
                System.out.println("Ingrese un numero: ");
                int num = leer.nextInt();
            if(num==1 || num==0){
                System.out.println("Deja de joder");
            }else{
                 if(conversorDePrimos(num) == true){
                     System.out.println("Tu numero es primo");
                 
            }else{
                     System.out.println("Tu numero NO es primo");
                 }
                
               
                
            } 
    }
public static boolean conversorDePrimos(int num){ 
for (int i=2 ; i<num ; i++) {
if(num%i==0)
return false;
}
return true;
}

}
    


    


