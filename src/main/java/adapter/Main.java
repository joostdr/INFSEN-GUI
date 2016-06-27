package adapter;

/**
 * Created by joost on 26-6-2016.
 */
public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Banana banana = new Banana();
        Grape grape = new Grape();

        GrapeImageAdapter grapeImageAdapter = new GrapeImageAdapter(grape);
        BananaImageAdapter bananaImageAdapter = new BananaImageAdapter(banana);
        apple.showApple();
        banana.showBanana();
        grape.showGrape();

        bananaImageAdapter.showApple();
        bananaImageAdapter.getColor();

        grapeImageAdapter.showApple();
        grapeImageAdapter.getColor();


    }
}
