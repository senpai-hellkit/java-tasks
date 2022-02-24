package app;

import java.util.Random;

public record Query(int id) implements Retryable {
    @Override
    public void request() throws Exception {
        Random random = new Random();
        boolean isSuccess = random.nextBoolean();
        if (!isSuccess) {
            throw new Exception("error");
        }
        System.out.println("sleep...");
        Thread.sleep(100000L);
    }
}