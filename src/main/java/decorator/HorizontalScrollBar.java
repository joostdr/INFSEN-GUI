package decorator;

/**
 * Created by joost on 26-6-2016.
 */
public class HorizontalScrollBar extends WindowDecorator{

    public HorizontalScrollBar(Window window) {
        super(window);
    }

    public void getDescription() {
        System.out.println("with Horizontal Scrollbar ");
    }
}
