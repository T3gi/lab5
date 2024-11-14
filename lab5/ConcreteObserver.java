package lab5;
/**
 * The {@code lab5.ConcreteObserver} class implement the {@link Observer} interface
 * <p>
 * The class to create trigger
 * This class provides an implementation of the {@link #update(String)} method to preform a specific operation defined
 * in {@link Observer#update(String)}}
 * </p>
 */
public class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(this.name + " has received " + message);
    }
}
