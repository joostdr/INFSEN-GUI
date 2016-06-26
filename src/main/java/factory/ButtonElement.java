package factory;

/**
 * Created by joost on 26-6-2016.
 */
public class ButtonElement extends Element {

    private String type;

    public ButtonElement() {
        System.out.println("Button");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
