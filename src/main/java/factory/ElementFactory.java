package factory;

/**
 * Created by joost on 26-6-2016.
 */
public class ElementFactory {

    public static Element createElement(String elementType, String elementName, String decorationType){
        switch(elementType){
            case "Button": return new ButtonElement(elementName);
            case "Label": return new LabelElement(elementName);
            case "Window": return new WindowElement(decorationType);
            default:return null;
        }
    }
}
