package abstractClassExapleSavarankiskas;

public class SmartPhone extends Device {
    @Override
    public void turneOn() {
        super.turneOn();
    }



    public void hasScreen() {
        System.out.println("Turiu puiku maza ekrana");
    }
    public void Kaina(){
        double kaina = 950;
        System.out.println("Kaina " + kaina);
    }
}





