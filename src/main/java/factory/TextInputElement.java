package factory;

/**
 * Created by joost on 26-6-2016.
 */
public class TextInputElement extends Element {

    private String textInput;

    public TextInputElement() {
        System.out.println("TextInput");
    }

    public String getTextInput() {
        return textInput;
    }

    public void setTextInput(String textInput) {
        this.textInput = textInput;
    }
}
