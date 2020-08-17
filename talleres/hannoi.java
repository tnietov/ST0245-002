;
import java.util.*;
public class hannoi
{   
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("¿Cuantos discos desea?");
        int disc = scan.nextInt();
        hanoi(disc,1,2,3);
        int mov= (int)(Math.pow(2, disc)-1);
        System.out.println("Los discos se movieron: "+mov);
    }
    
    public static void hanoi (int disc, int ini, int aux, int fin){
        
        if (disc == 1){
            System.out.println("Moviendo de: "+ ini + "a: " + fin);
        }else{
            hanoi(disc-1, ini, fin, aux);
            System.out.println("Moviendo de: "+ ini + "a:" + fin);
            hanoi(disc-1, ini, fin, aux);
        }
    
    }
}
