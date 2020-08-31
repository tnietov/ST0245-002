public class Insertion_sort
{
   public void InserstionSort(int[] arreglo){
      int i , y ,temp;

      for(i=1;i<arreglo.length;i++){   
         y= i-1; 
        while(arreglo[y]>arreglo[i] && y>=0 ){ 
            arreglo[y+1]=arreglo[y];
            y= y-1;
       }
        arreglo[y+1] = arreglo[i];
    }
  }   
}

public class Enigma
{
    public void suma(int[] n){
        int x=0,i;
        for(i=0;i<n.length;i++){
            x+=n[i];
            System.out.println("Variable sumo: "+ x);
        }
    }
}
