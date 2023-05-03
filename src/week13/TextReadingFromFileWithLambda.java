package week13;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Stream;

public class TextReadingFromFileWithLambda {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("C:\\Users\\vvp\\IdeaProjects\\JAVA_SDET_boot_camp\\src\\week13\\File.txt");
        Stream<String> str = Files.lines(path);
//        str.forEach(System.out::println);

//        System.out.println();
//        System.out.println("************************************************************************");

        // Task 1. Convert the first line of the file to upper case letters.
//        str.
//                map(String::toUpperCase). // .map() method is somewhat a .filter() method.
//                limit(1).
//                forEach(System.out::println);
//        System.out.println();
//        System.out.println("************************************************************************");
//        str.
//                map(String::toUpperCase). // .map() method is somewhat a .filter() method.
//                skip(1).
//                map(String::toLowerCase).
//                forEach(System.out::println);

        // Task 1. Convert the first line of the file to upper case letters.
//        String firstLine = str.findFirst().orElse("");
//        System.out.println(firstLine.toUpperCase());

//        System.out.println();
//        System.out.println("************************************************************************");

        // Task 2. Convert the rest of the lines to lower case letters.
//        str = Files.lines(path); // reset the stream to read the file again
//        str.skip(1).map(line -> line.toLowerCase()).forEach(System.out::println);

        // Task 3. Count all "A" or "a" in the file.
        System.out.println(str.
                map(t->t.split(" ")).
                flatMap(Arrays::stream). // .flatMap() method
                filter(t -> t.contains("a")).
                count());
    }
}
