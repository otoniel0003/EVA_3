/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3serializable12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/**
 *
 * @author Salid
 */
public class EVA3Serializable12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   try {
            ecribirArchObj();
            leerArchObj();
        } catch (Exception ex) {
            System.out.println("Error");
        }
    }
    
    public static void leerArchObj() throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream in = new FileInputStream("C:\\Archivos\\archiObjetos.poo");
        ObjectInputStream leerArch = new ObjectInputStream(in);
        while (true) {            
            Persona persona = ((Persona)leerArch.readObject());
            System.out.println(persona);
        }
    }
    
    private static void ecribirArchObj()throws IOException{
        FileOutputStream out = 
        new FileOutputStream("C:\\Archivos\\archiObjetos.poo", true);
        ObjectOutputStream guardarObj = new ObjectOutputStream(out);
            guardarObj.writeObject(new Persona("Juan","Perez",45));
            guardarObj.writeObject(new Persona("Sebastian","Chavez",35));
            guardarObj.writeObject(new Persona("Lupita","Raamirez",25));
            guardarObj.writeObject(new Persona("Esteban","Cruz",45));
            guardarObj.flush();
            guardarObj.close();
    }
}


class Persona implements Serializable{
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre: "+nombre+"\n"+
                "Apellidos: "+apellidos+"\n"+
                "Edad: "+edad;
    }
    
    
}