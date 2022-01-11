package abstractClassExapleSavarankiskas;

public class AbstractMain {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        Laptop laptop = new Laptop();

        laptop.turneOn();
        laptop.hasBigScreen();
        laptop.canAccessNet();
        laptop.kaina();

        System.out.println("_______________");
        smartPhone.turneOn();
        smartPhone.hasScreen();
        smartPhone.canAccessNet();
        smartPhone.Kaina();
    }

}


