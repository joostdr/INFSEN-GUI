package factory;

import javax.swing.*;

/**
 * Created by joost on 26-6-2016.
 */
public class LabelElement extends Element {
    private JLabel label;

    public LabelElement(String name) {
        this.label = new JLabel(name);
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }
}
