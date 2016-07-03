package decorator;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by joost on 26-6-2016.
 */

/**
 * Class for adding an icon to JFrame
 */

public class CustomIconWindow extends WindowDecorator{

    public CustomIconWindow(Window decoratedWindow) {
        super(decoratedWindow);
    }

    @Override
    public JFrame createWindow() {
        JFrame frame = decoratedWindow.createWindow();
        try{
            setIcon(frame);
        }catch(IOException e){
            e.printStackTrace();
        }
        return frame;
    }

    private void setIcon(JFrame frame) throws IOException {
        BufferedImage picture = ImageIO.read(new File("src/main/resources/4head.png"));
        frame.setIconImage(picture);
    }
}
