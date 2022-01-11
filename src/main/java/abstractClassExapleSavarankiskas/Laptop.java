package abstractClassExapleSavarankiskas;

public class Laptop extends Device {



    @Override
    public void turneOn() {
        super.turneOn();
    }


    public void hasBigScreen() {
        System.out.println("Turiu puiku dideli ekrana");
    }
    public void kaina(){
        double price = 1500;
        System.out.println("Kaina " + price);
    }

}
