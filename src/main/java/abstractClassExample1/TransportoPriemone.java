package abstractClassExample1;

public abstract class TransportoPriemone {
    private int maxSpeed;

    public TransportoPriemone(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void turnOnEngine(){
        System.out.println("Ijungiu varikli.");
    }

    public abstract void move();

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
