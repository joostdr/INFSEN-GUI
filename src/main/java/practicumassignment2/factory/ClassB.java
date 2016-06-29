package practicumassignment2.factory;

/**
 * Created by joost on 29-6-2016.
 */
public class ClassB implements FactoryInterface{

    String description;

    public ClassB() {
        this.description = "B";
    }

    @Override
    public String describe() {
        return description;
    }
}
