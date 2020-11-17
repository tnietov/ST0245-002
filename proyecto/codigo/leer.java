import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class leer
{
    ArrayList<String> datos = new ArrayList<>();
   
    //lee el archivo y crea un arraylist con cada linea
    public void leerArchivo(String nombreArchivo) throws FileNotFoundException {
        Scanner archivo = new Scanner(new File(nombreArchivo));
        archivo.nextLine();
        while(archivo.hasNextLine()) {
            String linea = archivo.nextLine();
            datos.add(linea);
        }
    }
    
    //imprime el arraylist
    public void imprimirArchivo(){
        for(int i = 0; i<datos.size(); i++){
            System.out.println(datos.get(i));
        }
    }
    
    //devuelve el arraylist
    public ArrayList<String> getDatos(){
        return datos;
    }
}
