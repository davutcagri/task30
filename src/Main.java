import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        for (int i = 1; i <= 100; i++) {
            executorService.submit(new Processor(i));
        }
        executorService.shutdown();
    }
}