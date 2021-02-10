package iterator;

// Java program to find the sum
// using imperative style of coding
import java.util.Arrays;
import java.util.List;

public class Iterator {
    public static void main(String[] args)
    {
        List<Integer> numbers
            = Arrays.asList(11, 22, 33, 44,
                            55, 66, 77, 88,
                            99, 100);
 
        int result = 0;

        for (Integer n : numbers) {
            if (n % 2 == 0) {
                result += n * 2;
            }

        }
        System.out.println(result);
    }
}
