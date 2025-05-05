/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3.unchecked_ex.pkg1;

import java.util.Scanner;
/**
 *
 * @author Salid
 */
public class EVA3UNCHECKED_EX1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //ARITHMETIC EXCEPTION --> DIVISION ENTRE CERO
        //int x = 5, y = 0;
        int x = 5, y = 1;
        int resu = x/y;
        System.out.println("Resultado: " + resu);
        
        //NULL POINTER EXCEPTION
        Prueba prueba = null;
        prueba.toString();
        
        //INDEXOUTOFBOUNDS EXCEPTION
        //ARREGLOS: LEER UNA POSICION QUE NO EXISTE
        int[] arreglo = new int[5];//0,1,2,3,4
        System.out.println(arreglo[10]);
        
        //INPUTMISMATH EXCEPTION
        //PIDEN UN DATO DE UN TIPO Y SE MANDA OTRO DIFERENTE
        Scanner cap = new Scanner(System.in);
        System.out.println("Introduce un numero entero: ");
        int valor = cap.nextInt();
        System.out.println("Valor = " + valor);
        
        System.out.println("!!Fin del Programa!!");
    }
    
}

class Prueba{}
    
    

