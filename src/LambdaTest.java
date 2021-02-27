import java.util.concurrent.atomic.AtomicInteger;

public class LambdaTest {
    public static void main(String[] args) {

        AtomicInteger counter = new AtomicInteger();

        new Thread(() -> counter.getAndIncrement()).start();
    }
}
