package extendsExample2;

public class Driver extends Worker {


    public Driver(String name) {
        super(name);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
    }

    @Override
    public void goingToWork() {
        super.goingToWork();
    }

    public void drivingTaxi() {
        System.out.println("2. Driving taxi");
    }
}
