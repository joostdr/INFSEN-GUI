package practicumassignment2.factory;

/**
 * Created by joost on 29-6-2016.
 */
public class ClassA implements FactoryInterface{

    String description;
    public ClassA() {
        this.description = "A";
    }

    @Override
    public String describe() {
        return description;
    }
}
