/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_8_throw;

/**
 *
 * @author Salid
 */
public class EVA3_8_THROW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      try{
          Persona perso = new Persona("otoniel", "salido", -1);
          System.out.println("Datos: " + perso);
      }catch(RuntimeException e){
          System.out.println("los datos no pueden ser capturados");
      }
      System.out.println("vuelva a escribir los datos correctamente");
    }
    
}
class Persona{
    private String nombre;
    private String apellido;
    private int edad;
    
    public Persona(String nombre, String apellido, int edad){
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

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad < 0)
            throw new RuntimeException("la edad no puede ser unnumero negativo");
        
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