import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        List<String> strings = List.of("one","two","three");

        Stream<String> stringStream = strings.stream();

        IntStream intStream = IntStream.of(10,40,40,50,5);
    }
}
