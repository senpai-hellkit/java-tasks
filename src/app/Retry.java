package app;

public class Retry <T extends Retryable> {
    T cls;
    int attempt = 0;
    int maxAttempt;
    int msec;

    public Retry(T cls, int maxAttempt, int msec) throws InterruptedException {
        this.cls = cls;
        this.maxAttempt = maxAttempt;
        this.msec = msec;
        Thready thready;
        while (true){
            if(this.attempt <= maxAttempt){
                int i = 0;
                thready = new Thready((Query) this.cls);
                thready.start();
                while (i < msec){
                    if(!thready.isAlive()){
                        break;
                    }
                    Thread.sleep(msec / 100);
                    i += msec / 100;
                }
                if(thready.hasError){
                    System.out.println("Retry!");
                    attempt++;
                    thready.interrupt();
                }
                if(thready.isAlive()){
                    System.out.println("Timeout!");
                    attempt++;
                    thready.interrupt();
                }
                System.out.println("Great..");
            } else {
                System.out.println("hmm...");
            }
            break;
        }
    }
}