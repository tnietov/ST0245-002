

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
