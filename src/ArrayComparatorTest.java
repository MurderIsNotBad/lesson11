import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayComparatorTest {
    public static void main(String[] args) {
        String[] strings = {"one","two","three","four","five"};
        String[] strings1 = {"one"};
        String[] strings2 = {"one","two","three"};

        List<String[]> list = (List.of(strings1, strings, strings2));

        Comparator<String[]> comparator = (o1, o2) -> o1.length - o2.length;
        list.sort(comparator);
        printResult(list);
    }
    private static void printResult(List<String[]> strings){
        System.out.println("--------");
        for(String[] str : strings){
            System.out.println(Arrays.toString(str));
        }
    }
}
