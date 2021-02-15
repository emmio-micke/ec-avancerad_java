package temp;

import java.lang.String;
import java.util.stream.*;
import java.util.function.Supplier;
import java.util.*;
import java.nio.file.*;
import java.io.IOException;

public class Temperature {
	public static void main(String[] args) throws IOException {
		String filename="/Users/micke/www/projects/ec education/java/avancerad java/ec-avancerad_java/exercises/01 - temp/temp/temp.txt";

        // Make a new stream for every operation
        OptionalDouble min = Files
            .lines(Paths.get(filename))
			.map(str -> str.replace(",", "."))
            .mapToDouble(num -> Double.parseDouble(num))
            .min();

        System.out.println(min);

        OptionalDouble max = Files
            .lines(Paths.get(filename))
			.map(str -> str.replace(",", "."))
            .mapToDouble(num -> Double.parseDouble(num))
            .max();

        System.out.println(max);

        OptionalDouble average = Files
            .lines(Paths.get(filename))
			.map(str -> str.replace(",", "."))
            .mapToDouble(num -> Double.parseDouble(num))
            .average();

        System.out.println(average);
	}
}
