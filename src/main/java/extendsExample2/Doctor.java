package extendsExample2;

public class Doctor extends Worker {
    public Doctor(String name) {
        super(name);

    }

    @Override
    public void goingToWork() {
        super.goingToWork();
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
    }

    public void treatsPeople() {
        System.out.println("2. Treats people");
    }
}


