public class no14
{
public boolean no14(int[] nums) {
    boolean two = false,four = false;
    for(int count = 0;count <nums.length; count++) {
        if (nums[count] == 1)
        two = true;
        if(nums[count] == 4)
        four = true;
 }
    if(nums.length == 0 || nums.length == 1)
    return true;
    else if (two ==true && four ==true)
    return false;
    else if (two || four)
    return true;
    else
    return false; }
}


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


public class fizzBuzz
{
    public String[] fizzBuzz(int start, int end) {
    int n = end - start;
    String[] result = new String[n];
    int pos = 0;
    for (int i = start; i < end; i++) {
        boolean fizz = i % 3 == 0;
        boolean buzz = i % 5 == 0;
        if (fizz && buzz) result[pos] = "FizzBuzz";
        else if (fizz) result[pos] = "Fizz";
        else if (buzz) result[pos] = "Buzz";
        else result[pos] = String.valueOf(i);
        pos++;
    }
    return result;
  }
}


public class matchup
{
    public int matchUp(int[] nums1, int[] nums2) {
        int count = 0;
  for (int i = 0; i < nums1.length; i++) {
    int tmp = Math.abs(nums1[i] - nums2[i]);
    if (tmp <= 2 && tmp > 0)
      count++;
  }
  return count;
  }
}

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
