

public class Countevens
{
    public int countevens(int[] numer){
    int even = 0;
       for(int count=0;count < numer.length; count++){
           if (numer[count]%2==0)
           even++;
        }
        return even;
    
    }
}
