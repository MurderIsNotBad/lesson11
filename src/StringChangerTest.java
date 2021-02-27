import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StringChangerTest {
    public static void main(String[] args) throws IOException {

        Supplier<String> stringSupplier = () -> {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try{
                return reader.readLine();
            }catch(IOException ioException){
                ioException.printStackTrace();
            }
            return null;
        };

        String inputString = stringSupplier.get();

        Function<String, String> reverseFunction = stringToReverse -> new StringBuilder(stringToReverse).reverse().toString();

        Function<String, String> upperCaseFunction = String::toUpperCase;

        Function<String, Integer> countFunction = String::length;

        Consumer<String> printer = System.out::println;

        Predicate<String> isEmptyPredicate = String::isEmpty;

        printer.accept(inputString);
        System.out.println(countFunction.apply(inputString));
        changeString(inputString, reverseFunction);
        changeString(inputString,upperCaseFunction);
        System.out.println(isEmptyPredicate.test(inputString));

    }
    public static void changeString(String string, Function<String, String> function){
        String newString = function.apply(string);
        System.out.println(newString);
    }
}
