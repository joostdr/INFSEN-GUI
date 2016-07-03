import factory.ElementFactory;
import factory.WindowElement;

import javax.swing.*;

/**
 * Created by joost on 27-6-2016.
 */
public class GUI {

    ElementFactory elementFactory;
    ContentSetter contentSetter;

    public GUI() {
        this.elementFactory = new ElementFactory();
        this.contentSetter = new ContentSetter();
    }

    public static void main(String[] args) {
        GUI main = new GUI();
        main.createGui();
    }

    public void createGui(){
        JFrame frame = ((WindowElement) elementFactory.createElement("Window","Main window","iconAndBorder")).getFrame(); //factory/decorator
        contentSetter.addLabels(frame); //iterator
        contentSetter.addButtons(frame); //iterator
        contentSetter.getAllLabels(frame);
        contentSetter.createIconList(); //visitor/adapter
        contentSetter.setIcons();
        contentSetter.createNone(frame); //option
        frame.setVisible(true);
    }

    //border types:
    //none
    //icon
    //border
    //iconAndBorder
}
