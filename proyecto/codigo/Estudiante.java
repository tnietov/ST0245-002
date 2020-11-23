import java.util.ArrayList;

public class Estudiante
{
    String trabaja, coleBilin, lenguaje, mate, biologia, quim, fisica, sociales, filo, ingles, success;
    
    /*Este método recibe un arreglo de lineas 
     * para poder separar de manera sencilla
     * las variables separadas por ";" y así
     * asignarlas a los atributos ya definidos
       */
    public void asignar(ArrayList<String> info, int i){
        String[] s = info.get(i).split("[;]");
        trabaja = s[45];
        coleBilin = s[54];
        lenguaje = s[65];
        mate = s[66];
        biologia = s[67];
        quim = s[68];
        fisica = s[69];
        sociales = s[70];
        filo = s[71];
        ingles = s[72];
        success = s[77];
    }
}

