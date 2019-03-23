
package pruebaexcepciones2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class PruebaExcepciones2 {

   public void leerArchivo() throws FileNotFoundException, IOException { //Con esta palabra throws se declara que va a tener una excepción
       File archivo = new File("C:\\Users\\LuisF\\Documents\\NetBeansProjects\\PruebaExcepciones2\\texto.txt");
       FileReader fr = new FileReader(archivo);
       BufferedReader bf  = new BufferedReader(fr);
       String linea;
       
         while((linea=bf.readLine())!=null){
        System.out.println(linea);
      }
      
   }
   
   public void leerArchivo2() {
       
        try{
            leerArchivo();
        }catch(FileNotFoundException ex){
            JOptionPane.showInputDialog(null,"No se ha encontrado el archivo, verifique la ruta");
        }catch(IOException e){
            JOptionPane.showInputDialog(null,"Ha ocurrido una excepcion verificada");
        }finally{
            //siempre se ejecuta
        }
        
       
       System.out.println("Programa terminado");
   }
    
    
    public static void main(String[] args)  {
       PruebaExcepciones2 prueba  = new PruebaExcepciones2();
       prueba.leerArchivo2();
    }
    
}
