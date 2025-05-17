/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_uso_excepciones_6;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Salid
 */
public class EVA3_USO_EXCEPCIONES_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Scanner cap = new Scanner (System.in);
        int nume = cap.nextInt();
        while(true){
            System.out.println("Introduce un nmero: ");
            if(cap.hasNextInt()){
                nume = cap.nextInt();
                break;
            }else{
                System.out.println("X-Se equivoco de dato ingrese uno valido-X");
                cap.next();
            }
            System.out.println("El valor capturado es = " + nume);
            cap.close();
        }*/
        int nume = 0;
        while(true){
            try{
                Scanner cap = new Scanner (System.in);
                System.out.println("Introduce un nmero: ");
                nume = cap.nextInt();
                break;
            }catch(InputMismatchException e){
                System.out.println("No es valido tu numero introduce otro.");
            }
            System.out.println("El valor capturado es = " + nume);
        }
            
    }
    
}