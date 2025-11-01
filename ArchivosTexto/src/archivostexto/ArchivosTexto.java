package archivostexto;

import java.io.*;
import java.io.IOException;

public class ArchivosTexto {

    File archivo;

    private void crearArchivoDeTexto() {
        archivo = new File("archivo.txt");
        try {
            if (archivo.createNewFile()) {
                //System.out.println("Archivo creado con exito");

            } else {
                //System.out.println("Error al crear archivo");
            }
        } catch (IOException exepcion) {
            exepcion.printStackTrace(System.out);

        }

    }

    private void eliminarArchivoDeTexto() {
      
            if (archivo.delete()) {
                System.out.println("Archivo eliminado con exito");

            } else {
                System.out.println("Error al eliminar el archivo");
                
            
            }
        }
            //Creamos el metodo para escribir al archivo de texto
     private void escribirAlArchivoDeTexto(){
         try{
             FileWriter escritura  = new FileWriter(archivo); //True puedo anadir texto si es False no.
             escritura.write("saludos!!!");
             escritura.write("\nHola Youtube");
             escritura.close();
             // \n hace que suceda el salto de linea en los textos,se escribe al inico despues de las ".
             //System.out.println("Texto anadido con exito");
     } catch(IOException exepcion) {
         exepcion.printStackTrace(System.out);
     }
     }
       //Creamos el metodo para leer un archivo de texto
     private void leerArchivoDeTexto(){
         String contenido;
         try{
             FileReader lector = new FileReader(archivo); //indicamos el archivo a leer
             BufferedReader lectura = new BufferedReader (lector);//le pasamos el archivo a leer
             
             contenido = lectura.readLine();
             
             while(contenido != null){
             System.out.println(contenido);
             contenido = lectura.readLine();
         }         
            }catch(IOException excepcion){
            excepcion.printStackTrace(System.out);
         }
     }
              public static void main(String args[]){
              ArchivosTexto archivoTexto = new ArchivosTexto();
              archivoTexto.crearArchivoDeTexto();
              archivoTexto.escribirAlArchivoDeTexto();
              archivoTexto.leerArchivoDeTexto();
          }
    }


           
         
