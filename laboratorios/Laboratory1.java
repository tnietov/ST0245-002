public class Laboratory1 {
    
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