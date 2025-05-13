/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_try_catch_3;

/**
 *
 * @author Salid
 */
public class EVA3_TRY_CATCH_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{//BLOQUE QUE INTENTA EJECUTAR UN CÓDIGO
            //QUE POTENCIALMENTE GENERA UNA EXCEPCIÓN
            int x = 5, y=0;
            int res = x/y;
            System.out.println("Resultado: " + res);
        }catch(ArithmeticException e){
            //AQUI TENEMOS QUE RESOLVER LA EXCEPCION
            e.printStackTrace();
        }
        System.out.println("!!-TERMINA PROGRAMA-!!");
    }
    
}