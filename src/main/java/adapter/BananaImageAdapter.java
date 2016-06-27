package adapter;

/**
 * Created by joost on 26-6-2016.
 */
public class BananaImageAdapter implements AppleImage {

    private Banana banana;

    public BananaImageAdapter(Banana banana) {
        this.banana = banana;
    }

    @Override
    public void showApple() {
        banana.showBanana();
    }

    @Override
    public void getColor() {
        banana.showColor();
    }
}
