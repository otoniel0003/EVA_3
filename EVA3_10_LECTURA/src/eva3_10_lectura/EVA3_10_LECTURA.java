/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_10_lectura;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


/**
 *
 * @author Salid
 */
public class EVA3_10_LECTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     String ruta = "C:\\Archivos\\El_Texto.txt";
        try {
            readUsingFiles(ruta);
            readUsingScanner(ruta);//SCANNER: Recomendable cuando necesitamos leer tokens (fragmentos) en otro tipo de datos
            readUsingBufferesReader(ruta);//BUFFERED READER: es usado para multitareas 
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void readUsingFiles(String ruta) throws IOException{
        System.out.println("LECTURA DE ARCHIVOS USANDO FILES");
        Path path = Paths.get(ruta);
        String cade = Files.readString(path);
        System.out.println(cade);
    }
    
    public static void readUsingScanner(String ruta) throws FileNotFoundException{
        System.out.println("LECTURA DE ARCHIVOS USANDO SCANNER");
        File source = new File(ruta);
        Scanner leerArch = new Scanner(source);
        String cade;
        while(leerArch.hasNextLine()){
            cade = leerArch.nextLine();//LEE LA LINEA ACTUAL, Y NOS MUEVE A LA SIGUIENTE
            System.out.println(cade);
        }
        leerArch.close();
    }
    
    public static void readUsingBufferesReader(String ruta) throws FileNotFoundException, IOException{
        System.out.println("LECTURA DE ARCHIVOS USANDO BUFFERED READER");
        File file = new File(ruta);
        FileInputStream inStream = new FileInputStream(file);
        InputStreamReader in = new InputStreamReader(inStream);
        BufferedReader BuRead = new BufferedReader(in);
        String cade;
               //asigno la cadena a cade, luego evaluo cade != null
        while((cade = BuRead.readLine()) != null){
            System.out.println(cade);
        }
        BuRead.close();//cierra el archivo y lo libera para ser usado otra vez
    }
}
   
    }
    
}
