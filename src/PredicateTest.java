import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer number = Integer.parseInt(reader.readLine());

        Predicate<Integer> predicateEven = integer -> integer % 2 == 0;
        Predicate<Integer> predicatePositive= integer -> integer > 0;
        Predicate<Integer> predicateP= integer -> integer % 5 == 0 ;


        checkNumberAndPrint(number, predicateEven);
        checkNumberAndPrint(number, predicatePositive);
        checkNumberAndPrint(number, predicateP);

    }
    private static void checkNumberAndPrint(Integer number, Predicate<Integer> predicate){
        System.out.println(predicate.test(number));
    }
}
