import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Reader{
   
   public static final String SEPARATOR=";";
   
   public static void main(String[] args) {
      
      BufferedReader br = null;
      BufferedReader br2 = null;
      int c,f,cont;
      try {
         
         br =new BufferedReader(new FileReader("lite.csv"));
         br2 =new BufferedReader(new FileReader("lite.csv"));
         String line = br.readLine();
         String line2 = br2.readLine();
         c=0;f=0;cont=0;
         while (null!=line) {
            cont++;
            String [] fields = line.split(SEPARATOR);
            c=fields.length;
            line = br.readLine();
         }
         String matriz[][] = new String[cont][c];
         while (null!=line2) {
            String [] fields = line2.split(SEPARATOR);
            for(int i=0;i<fields.length;i++){
                matriz[f][i]=fields[i];
            }
            line2 = br2.readLine();
            f++;
         }
         for (int x=0; x < matriz.length; x++) {
                  for (int y=0; y < matriz[x].length; y++) {
                    System.out.print(matriz[x][y]+"|");
              }
              System.out.print("\n");
            }
      } catch (Exception e) {
         System.err.println("Error! "+e.getMessage());
      } finally {
         if (null!=br){
            try {
               br.close();
            } catch (IOException e) {
               System.err.println("Error closing file !! "+e.getMessage());
            }
         }
      }
      
   }

}
