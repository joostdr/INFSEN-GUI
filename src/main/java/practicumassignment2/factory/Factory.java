package practicumassignment2.factory;

/**
 * Created by joost on 29-6-2016.
 */
public class Factory {

    public static void main(String[] args) {
        Factory factory = new Factory();
        FactoryInterface A = factory.create("A");
        FactoryInterface B = factory.create("B");
        System.out.println(A.describe());
        System.out.println(B.describe());
    }


    private FactoryInterface create(String name){
        FactoryInterface element = null;
        switch (name){
            case "A": element = new ClassA();
                break;
            case "B": element = new ClassB();
                break;
            default:
                System.out.println("Class with name: " + name + " does not exist!");
        }
        return element;
    }
}
