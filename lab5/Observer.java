package lab5;
/**
 * The {@code lab5.Observer} interface
 * If want to implement this interface you must provide an implementation
 * for the {@link #update(String)} method
 */
public interface Observer {
    void update(String message);
}
