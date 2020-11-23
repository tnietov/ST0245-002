import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class LeerArchivo
{
    ArrayList<String> lineas = new ArrayList<>();
    
    //lee el archivo y crea un arraylist con cada linea
    public void leerArchivo(String nombreArchivo) throws FileNotFoundException {
        Scanner archivo = new Scanner(new File(nombreArchivo));
        archivo.nextLine();
        while(archivo.hasNextLine()) {
            String linea = archivo.nextLine();
            lineas.add(linea);
        }
    }
     
    //devuelve el arraylist
    public ArrayList<String> getDatos(){
        return lineas;
    }
}
