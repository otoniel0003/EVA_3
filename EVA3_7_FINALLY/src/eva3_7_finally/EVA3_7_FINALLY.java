/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_finally;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Salid
 */
public class EVA3_7_FINALLY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         try{
            Scanner cap = new Scanner(System.in);
            System.out.println("escribe un numero entero: ");
            int num = cap.nextInt();
            System.out.println("tu numero es: " + num);
        }catch(InputMismatchException e){
            System.out.println("dato incorrecto");
        }finally{//SIEMPRE SE EJECUTA:
            //BLOQUE DE CODIGO CON INSTRUCCIONES QUE DEBEN EJECUTAR
            //SIN IMPORTAR QUE HAYA O NO EXCEPCIONES
            System.out.println("Esta linea siempre se va a ejecutar");
        }
        System.out.println("x-Se cerrara el programa-x");
    }
    
}