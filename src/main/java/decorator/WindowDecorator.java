package decorator;

import factory.ElementFactory;
import factory.WindowElement;

import javax.swing.*;

/**
 * Created by joost on 26-6-2016.
 */
public abstract class WindowDecorator implements Window {

    protected Window decoratedWindow;

    public WindowDecorator(Window window) {
        this.decoratedWindow = window;
    }

    public JFrame createWindow() {
        return decoratedWindow.createWindow();
    }
}
