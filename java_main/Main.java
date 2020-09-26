import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream.range(1, 100).forEach((i) -> {
            try {
                TimeUnit.SECONDS.sleep(1);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }
}