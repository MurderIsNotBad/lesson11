import java.security.Key;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {


    public static void main(String[] args) {
        List<String> strings = List.of("one","two","three");

        Stream<String> stringStream = strings.stream();

        IntStream intStream = IntStream.of(10,40,40,50,5);

        intStream
                .distinct()
                .forEach(System.out::println);

        List<Integer> numbers = List.of(10,40,40,50,5);

        System.out.println(numbers.stream()
                .filter(number -> number > 10)
                .count());

        stringStream
                .filter(string -> string.length() == 3)
                .forEach(System.out::println);

        strings.stream()
                .map(String::length)
                .forEach(System.out::println);


    }
}
