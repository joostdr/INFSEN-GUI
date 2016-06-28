package visitor;

import adapter.Apple;
import adapter.Banana;
import adapter.Grape;
import visitor.surface.SurfaceVisitor;

/**
 * Created by joost on 27-6-2016.
 */
public class Main {

    private Apple apple;
    private Banana banana;
    private Grape grape;
    private SurfaceVisitor surfaceVisitor;

    public static void main(String[] args) {
        Main main = new Main();
        main.setApple(new Apple());
        main.setBanana(new Banana());
        main.setGrape(new Grape());
        main.setSurfaceVisitor(new SurfaceVisitor());

        System.out.println(main.getApple().accept(main.getSurfaceVisitor()).getHeight());
        System.out.println(main.getApple().accept(main.getSurfaceVisitor()).getWidth());

        System.out.println(main.getSurfaceVisitor().visit(main.getBanana()).getHeight());
        System.out.println(main.getSurfaceVisitor().visit(main.getBanana()).getWidth());

        System.out.println(main.getSurfaceVisitor().visit(main.getGrape()).getHeight());
        System.out.println(main.getSurfaceVisitor().visit(main.getGrape()).getWidth());

    }

    public Apple getApple() {
        return apple;
    }

    public void setApple(Apple apple) {
        this.apple = apple;
    }

    public Banana getBanana() {
        return banana;
    }

    public void setBanana(Banana banana) {
        this.banana = banana;
    }

    public Grape getGrape() {
        return grape;
    }

    public void setGrape(Grape grape) {
        this.grape = grape;
    }

    public SurfaceVisitor getSurfaceVisitor() {
        return surfaceVisitor;
    }

    public void setSurfaceVisitor(SurfaceVisitor surfaceVisitor) {
        this.surfaceVisitor = surfaceVisitor;
    }
}
