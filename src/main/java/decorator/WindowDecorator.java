package decorator;

/**
 * Created by joost on 26-6-2016.
 */
public abstract class WindowDecorator implements Window {

    protected Window tempWindow;

    public WindowDecorator(Window window) {
        this.tempWindow = window;
    }

    public void getDescription() {
        tempWindow.getDescription();
    }
}
