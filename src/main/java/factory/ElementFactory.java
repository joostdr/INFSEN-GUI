package factory;

/**
 * Created by joost on 26-6-2016.
 */
public class ElementFactory {

    public Element createElement(String elementName){
        switch(elementName){
            case "Button": return new ButtonElement();
            case "Label": return new LabelElement();
            case "TextInput": return new TextInputElement();
            default:return null;
        }
    }
}
