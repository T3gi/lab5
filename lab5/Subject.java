package lab5;
/**
 * The {@code lab5.Subject} interface
 * If want to implement this interface you must provide an implementation
 * for the {@link #registerTrigger(Observer)},  {@link #removeTrigger(Observer)} and {@link #notifyTriggers(String)} methods
 */
public interface Subject {
    void registerTrigger(Observer observer);
    void removeTrigger(Observer observer);
    void notifyTriggers(String message);
}
