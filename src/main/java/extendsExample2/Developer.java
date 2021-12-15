package extendsExample2;

public class Developer extends Worker{

    public Developer(String name) {
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

    public void developsApplications() {
        System.out.println("2. Develops applications");
    }
}
