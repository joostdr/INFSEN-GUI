package decorator;

/**
 * Created by joost on 26-6-2016.
 */
public class VerticalScrollBar extends WindowDecorator {

    public VerticalScrollBar(Window window) {
        super(window);
    }

    public void getDescription() {
        System.out.println("with Vertical Scrollbar ");
    }
}
