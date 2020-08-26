

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
