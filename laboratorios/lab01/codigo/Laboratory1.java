public class Laboratory1 {
    / Title: Isabella Quintero, Sofia Vega
     Author: Mauricio Toro 
     Date: 23/08/2020
     Code version: 1.0
     Availability: https://github.com/mauriciotoro/ST0245-Eafit/tree/master/laboratorios/lab01/codigo_estudiante/codigo/java
    /
    
    /**
     * This method calculates the longest common sequence between two strings
     * @param string1 First string
     * @param string2 Second string
     * @return length of the largest common sequence between cadena
     */
    public static int lcsDNA(String string1, String string2){
        return lcsDNAAux(string1,string2,string1.length(),string2.length());
    }
    /**
     * This method is an auxiliar for lcsDNA
     * @param string1 first characters string
     * @param string2 second characters string
     * @param m length of cadena1
     * @param n length of cadena 2
     * @return length of the largest common sequence between two strings
     */
    private static int lcsDNAAux(String string1, String string2, int m, int n) {
        if(string1.charAt(m-1)!=string2.charAt(n-1)){
            return 0;
        }
        if(string1.charAt(m-1)==string2.charAt(n-1)){
            return 1 + lcsDNAAux(string1,string2,m,n);
        }
        return Math.max(lcsDNAAux(string1,string2,m-1,n), lcsDNAAux(string1,string2,m,n-1));
    }
    
}




public class rectang
{
    int n;
    int base_rec1 = 2;
    int base_rec2 = 1;
    int h = 2;
    
    public static int rectangulo(int base_rec1, int n){
        
        if (n==0){
          System.out.println("La altura es 0,no existe ninguna forma.");
          return 0;
        }
        if (n>= 1){
            System.out.println("La cantidad de formas de llenar el rectangulo son: " + n);
            return n;
        } 
        
    }
    
        
}
