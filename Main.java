import lab5.ConcreteObserver;
import lab5.Object;
import lab5.RelativeTable;

public class Main {
    public static void main(String[] args) {
        Object object = new Object(1, "Hello world");
        Object object2 = new Object(2, "World hello");
        Object object3 = new Object(3, "Hell old");
        object.operation();
        object2.operation();
        object3.operation();
        System.out.println();
        ConcreteObserver trigger1 = new ConcreteObserver("triger1");
        ConcreteObserver trigger2 = new ConcreteObserver("triger2");
        RelativeTable relativeTable = new RelativeTable("table1");
        relativeTable.addObject(object);
        relativeTable.addObject(object2);
        relativeTable.addObject(object3);
        relativeTable.registerTrigger(trigger1);
        relativeTable.registerTrigger(trigger2);
        relativeTable.operation();
        relativeTable.changeObject(2, object);
        relativeTable.operation();
        relativeTable.removeTrigger(trigger1);
        relativeTable.changeObject(2, object2);
        relativeTable.operation();
    }
}