package kg.kloop.android.julysandbox;

public class Cat extends Animal {

    private Mouse mouse;
    private int legs;

    public Cat() {

    }

    public Cat(Mouse mouse, int legs) {
        this.mouse = mouse;
        this.legs = legs;
    }

    public void catchMice() {
        mouse.setCaught(true);
    }

    @Override
    public void run() {
        super.run();

    }

    public Mouse getMouse() {
        return mouse;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }
}
