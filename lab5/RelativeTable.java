package lab5;

import java.util.ArrayList;
import java.util.List;
/**
 * The {@code lab5.RelativeTable} class implement the {@link Component} and {@link Subject} interfaces
 * <p>
 * Relative table
 * This class provides an implementation of the {@link #operation()} method to preform a specific operation defined
 * in {@link Component#operation()}}
 * </p>
 */
public class RelativeTable implements Subject, Component {
    private String name;
    private List<Object> table = new ArrayList<>();
    private List<Observer> triggers = new ArrayList<>();
    public RelativeTable(String name){
        this.name = name;
    }
    public void addObject(Object object){
        table.add(object);
    }
    public void removeObject(Object object){
        table.remove(object);
    }

    public void changeObject(int index, Object object) {
        table.set(index - 1, object);
        notifyTriggers("changes");
    }
    public void registerTrigger(Observer observer){
        triggers.add(observer);
    }
    public void removeTrigger(Observer observer){
        triggers.remove(observer);
    }
    @Override
    public void notifyTriggers(String action) {
        for(Observer observer : triggers){
            observer.update(action);
        }
        System.out.println();
    }
    public void operation(){
        System.out.println("Table elements (" + name + ")");
        for(Object object : table){
            object.operation();
        }
        System.out.println();
    }
}
