package decorator;

import javax.swing.*;

/**
 * Created by joost on 26-6-2016.
 */

/**
 * Class for setting a custom border around JFrame
 */

public class CustomBorderWindow extends WindowDecorator {

    public CustomBorderWindow(Window decoratedWindow) {
        super(decoratedWindow);
    }

    @Override
    public JFrame createWindow() {
        JFrame frame = decoratedWindow.createWindow();
        setBorder(frame);
        return frame;
    }

    private void setBorder(JFrame frame){
        frame.setDefaultLookAndFeelDecorated(true);
    }

}
