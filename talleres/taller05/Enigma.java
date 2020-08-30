
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
