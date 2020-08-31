public class Insertion_sort
{
   public void InserstionSort(int[] arreglo){
      int i , y ,temp;// c_1

      for(i=1;i<arreglo.length;i++){   //C_2+t(n-1)
         y= i-1; //C_3t
        while(arreglo[y]>arreglo[i] && y>=0 ){ // C_4 +T(n-1)
            arreglo[y+1]=arreglo[y];//// C_5
            y= y-1; //C_6
       }
        arreglo[y+1] = arreglo[i]; //C_7
     
    }
           //T(n)=C_2+T(n-1)+C_4+T(n-1)
  }   
}

public class Enigma
{
    public void suma(int[] n){
        int x=0,i;//C_1
        
        for(i=0;i<n.length;i++){//C_2 + T(n-1)
            x+=n[i];//C_3
            System.out.println("Variable sumo: "+ x);//C_4
        }
       
    }
}
