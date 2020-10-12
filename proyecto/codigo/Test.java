import javafx.util.Pair;
import java.util.Arrays;
public class Test
{
    public void main(){
        String ruta= Input.sInput("nombre de archivo?");
        String[][] matrizRaiz = Reader.main(ruta);
        String[] valor={"Estrato 4","Estrato 5", "Estrato 6"};
        //String[] variable={"31"};
        elGiniPonderado(matrizRaiz, 32,valor);
    } 

    public static void elGiniPonderado(String[][] m, int variable,  String[] valor){
        Pair<String[][], String[][]> pareja = separador(m, variable, valor);
        String[][] parejaVerdadera = pareja.getKey();
        String[][] parejaFalsa = pareja.getValue();
        
        float giniVerdadero = sacarElGini(parejaVerdadera);
        float giniFalso = sacarElGini(parejaFalsa);
        
        int keyLength = parejaVerdadera.length;
        int valueLength = parejaFalsa.length;
        int mLength = m.length;
        
        float giniPonderado = ((giniVerdadero*keyLength) + (giniFalso*valueLength)) / mLength ;
        System.out.println("el gini Ponderado es: "+ giniPonderado +" \n el gini Cuando es verdadero es: "+giniVerdadero+" \n el gini Cuando es falso es: "+giniFalso);
        
    }

    public static float sacarElGini(String[][] m){
        String[] cero={"0","0","0"};
        int exitoFalso = variableIgualCondicion(m, m[0].length-1,cero);
        int exitoVerdadero = m.length - exitoFalso;
        double length = m.length;
        float gini = (float)(1 - ((Math.pow((exitoFalso/length),2)) - (Math.pow((exitoVerdadero/length),2))));
        return gini; 
    }

    private static int variableIgualCondicion(String[][] m, int variable, String[] valor){
        int enCuantasFilasLaVariableEsIgualALaCondicion = 0;
        for (int filas = 0; filas < m.length; filas++){
            if (m[filas][variable].equals(valor[0]) || m[filas][variable].equals(valor[1])||m[filas][variable].equals(valor[2]))
                enCuantasFilasLaVariableEsIgualALaCondicion++;
            }
        return enCuantasFilasLaVariableEsIgualALaCondicion;      
    }

    private static void llenarMatrices(String[][] m, String[][] matrizCuandoDaVerdadero, String[][] matrizCuandoDaFalso,int variable, String[] valor){ // Xtreme Programming
        int laUltimaFilaVerdadero = 0;  
        int laUltimaFilaFalso = 0;
        for (int filas = 0; filas < m.length; filas++)
            if (m[filas][variable].equals(valor[0])||m[filas][variable].equals(valor[1])||m[filas][variable].equals(valor[2]))
               matrizCuandoDaVerdadero[laUltimaFilaVerdadero++] = m[filas];
            else
                matrizCuandoDaFalso[laUltimaFilaFalso++] = m[filas];
    }

    public static Pair<String[][], String[][]> separador(String[][] m, int variable, String[] valor){
        int variableIgualCondicion = variableIgualCondicion(m, variable, valor);
        String[][] matrizCuandoDaVerdadero = new String[variableIgualCondicion][m[0].length];
        String[][] matrizCuandoDaFalso = new String[m.length - variableIgualCondicion][m[0].length];
        llenarMatrices(m,matrizCuandoDaVerdadero,matrizCuandoDaFalso,variable, valor);
        return new Pair(matrizCuandoDaVerdadero, matrizCuandoDaFalso);
    }
}