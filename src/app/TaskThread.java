package app;

public class Thready extends Thread {
    Query cls;
    boolean hasError = false;

    public Thready(Query cls) {
        this.cls = cls;
    }

    public void run() {
        try {
            cls.request();
        } catch (Exception e){
            hasError = true;
        }
    }
}