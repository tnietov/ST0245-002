

public class sum13
{
   public int sum13(int[] numer){
       int sum = 0;
        for(int i= 0;i<numer.length;i++){
            if(numer[i] != 13)
                sum+=numer[i];
            if(i>0 && numer[i-1]==13)
                sum -= numer[i];

        }
       
        return sum;
    }
}
