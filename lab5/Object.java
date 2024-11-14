package lab5;
/**
 * The {@code lab5.Object} class implement the {@link Component} interface
 * <p>
 * The object of the table
 * This class provides an implementation of the {@link #operation()} method to preform a specific operation defined
 * in {@link Component#operation()}}
 * </p>
 */
public class Object implements Component {
    int id;
    private String data;
    public Object(int id, String data) {
        this.id = id;
        this.data = data;
    }
    @Override
    public void operation(){
        System.out.println(data);
    }
}
