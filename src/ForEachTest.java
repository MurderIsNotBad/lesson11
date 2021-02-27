import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ForEachTest {
    public static void main(String[] args) {

        List<String> strings = List.of("one","two","three");

        strings.forEach(ForEachTest::print);

        Supplier<String> stringSupplier = String::new;
        String newString = stringSupplier.get();

    }
    public static void print(String string){
        System.out.println("--------");
        System.out.println(string);
    }
}
