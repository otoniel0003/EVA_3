/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_stack_2;

/**
 *
 * @author Salid
 */
public class EVA3_STACK_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("Inicia Main");
        A();
        System.out.println("Termina Main");
    }
    public static void A(){
        System.out.println("Inicia A");
        B();
        System.out.println("Termina A");
    }
    public static void B(){
        System.out.println("Inicia B");
        C();
        System.out.println("Termina B");
    }
    public static void C(){
        System.out.println("Inicia C");
        //int x = 5, y = 0;
        int x = 5, y = 1;
        int resu = x/y;
        System.out.println("Resultado: " + resu);
        System.out.println("Termina C");
    }
    
}
    
    

