import java.util.Comparator;
import java.util.List;

public class SumTest {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(4,6,2,90,11,60);

        Integer sum = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println("sum: " + sum);

        Optinal<Integer> min = numbers.stream()
                .min(Comparator.comparingInt(Integer::intValue));
        System.out.println("min" + min);

        Optinal<Integer> max = numbers.stream()
                .min(Comparator.comparingInt(Integer::intValue));
        System.out.println("max" + max);

    }
}
