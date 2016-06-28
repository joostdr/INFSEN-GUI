package factory;

import decorator.BasicWindow;
import decorator.CustomBorderWindow;
import decorator.CustomIconWindow;
import decorator.Window;

import javax.swing.*;

/**
 * Created by joost on 26-6-2016.
 */
public class WindowElement extends Element {

    private JFrame frame;

    public WindowElement(String decorationType) {
        Window window = null;
        switch(decorationType){
            case "none": window = new BasicWindow();
                break;
            case "icon": window = new CustomIconWindow(new BasicWindow());
                break;
            case "border": window = new CustomBorderWindow(new BasicWindow());
                break;
            case "iconAndBorder": window = new CustomBorderWindow(new CustomIconWindow(new BasicWindow()));
                break;
            default: window = new BasicWindow();
        }
        window.createWindow();
        this.frame = window.createWindow();
        frame.setLayout(null);
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }
}
