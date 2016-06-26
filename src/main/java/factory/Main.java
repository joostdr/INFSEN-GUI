package factory;

/**
 * Created by joost on 26-6-2016.
 */
public class Main {

    public static void main(String[] args) {
        ElementFactory elementFactory = new ElementFactory();
        Element e = elementFactory.createElement("Button");
        Element f = elementFactory.createElement("TextInput");
        Element c = elementFactory.createElement("Label");
    }

}
