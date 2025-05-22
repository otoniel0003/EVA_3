/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_throw_2;

/**
 *
 * @author Salid
 */
public class EVA3_THROW_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso = null;
        try{
            perso = new Persona("otoniel", "salido", -11);
        }catch(Exception e){
        }
        System.out.println("Datos: " + perso);
    }
    
}


class Persona{
    private String nombre;
    private String apellido;
    private int edad;
    
    public Persona(){
        this.nombre = "-Sin Dato-";
        this.apellido = "-Sin Dato-";
        this.edad = 0;
    }
    public Persona(String nombre, String apellido, int edad) throws Exception{
        this.nombre = nombre;
        this.apellido = apellido;
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellidos) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        if(edad < 0)
            throw new Exception("La edad no puede ser un numero negativo");
        else
            this.edad = edad;
    }
    
    @Override
    public String toString(){
        return "Datos de la persona:  \n" + 
                "Nombre:" + nombre + "\n" +
                "Apellido:" + apellido + "\n"+
                "Edad:" + edad;
    }
    
}
    
    

