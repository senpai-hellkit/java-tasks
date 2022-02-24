package app;

public interface Retryable {
    void request() throws Exception;
}