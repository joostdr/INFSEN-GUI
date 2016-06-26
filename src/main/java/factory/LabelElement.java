package factory;

/**
 * Created by joost on 26-6-2016.
 */
public class LabelElement extends Element {
    private String type;

    public LabelElement() {
        System.out.println("Label");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
