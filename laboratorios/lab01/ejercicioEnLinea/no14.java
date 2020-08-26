

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
