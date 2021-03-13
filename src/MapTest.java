import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> strings = new HashMap<>(Map.of(
                1,"val1",
                2,"val2",
                3,"val3",
                4,"val4"
        ));
        for(Map.Entry<Integer, String> entry: strings.entrySet()){
            System.out.println("key" + entry.getKey() + ", value: " + entry.getValue());
        }
        strings.forEach((key,value)-> System.out.println("key" + key + ", value: " + value));

        strings.putIfAbsent(3, "new val3");
        System.out.println("-----------");
        strings.forEach((key,value)-> System.out.println("key" + key + ", value: " + value));

        String string4 = strings.computeIfAbsent(6,key -> "value for" + key);

        System.out.println("___________________");
        System.out.println(string4);
        strings.forEach((key,value) -> System.out.println("key" + key + ", value: " + value));
        strings.merge(1,"new value", (oldValue, newValue) -> oldValue + newValue);
        System.out.println("---------------");
        strings.forEach((key,value) -> System.out.println("key" + key + ", value: " + value));

        String string5 = strings.getOrDefault(3,"default value");
        System.out.println(string5);
    }
}
