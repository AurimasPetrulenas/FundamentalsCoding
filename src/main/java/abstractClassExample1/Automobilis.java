package abstractClassExample1;

public class Automobilis extends TransportoPriemone{

    public Automobilis(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public void move() {
        System.out.println("Vaziuoju " + getMaxSpeed() + " greiciu");
    }
}
