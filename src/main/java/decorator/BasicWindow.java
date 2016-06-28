package decorator;

import factory.ElementFactory;
import factory.WindowElement;

import javax.swing.*;
import java.awt.*;

/**
 * Created by joost on 26-6-2016.
 */
public class BasicWindow implements Window {

    public JFrame createWindow() {
        JFrame frame = new JFrame("GUI");
        frame.setSize(new Dimension(1200,800));
        return frame;
    }
}
