/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_11_escritura_de_archivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Salid
 */
public class EVA3_11_ESCRITURA_DE_ARCHIVOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          String ruta = "C:\\Archivos\\";
        try {
            writeUsingFiles(ruta, "Hola como estan \n Escribiendo archivos de la practica");
            writeUsingFileWriter(ruta, "Hola como estan \n Escribiendo archivos de la practica");
            writeUsingBufferedWriter(ruta);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void writeUsingFiles(String ruta, String texto) throws IOException{
        System.out.println("ESCRIBIR USANDO FILES");
        Path path = Paths.get(ruta + "Gusano.txt");
        Files.write(path, texto.getBytes());
    }
    
    public static void writeUsingFileWriter(String ruta, String texto) throws IOException{
        System.out.println("ESCRIBIR USANDO FILEWRITER");
        File file = new File(ruta + "Mangoneada2.txt");
        FileWriter Asa = new FileWriter(file);
        Asa.write(texto);
        Asa.close();
    }
    
    public static void writeUsingBufferedWriter(String ruta) throws IOException{
        System.out.println("ESCRIBIR USANDO BUFFEREDWRITER");
        File file = new File(ruta + "MangoChamoy.txt");
        FileWriter out = new FileWriter(file);
        BufferedWriter esca = new BufferedWriter(out);
        for (int i = 0; i < 10; i++) {
            esca.write("Escritura hecha con el bufferedwriter");
            esca.write("\n");
        }
        esca.close();
    }
}
    
    
