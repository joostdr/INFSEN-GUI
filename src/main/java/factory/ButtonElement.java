package factory;

import javax.swing.*;
import java.awt.*;

/**
 * Created by joost on 26-6-2016.
 */
public class ButtonElement extends Element {

    private JButton button;

    public ButtonElement(String name) {
        this.button = new JButton(name);
        button.setPreferredSize(new Dimension(40, 40));
    }


    public JButton getButton() {
        return button;
    }

    public void setButton(JButton button) {
        this.button = button;
    }
}
