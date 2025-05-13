/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_try_catch_4;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Salid
 */
public class EVA3_TRY_CATCH_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner cap =  new Scanner(System.in);
        try{
        System.out.println("Introduce un valor entero: ");
        int valor = cap.nextInt();
        System.out.println("El valor es = " + valor);
        }catch(InputMismatchException e){
            e.printStackTrace();
        }
        System.out.println("!!-TERMINA EL PROGRAMA-!!");
    }
    
}