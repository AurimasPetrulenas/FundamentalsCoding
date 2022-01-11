package abstractionFruitPerPaskaitaTask1;

public class Watermelon extends Fruit {
    public Watermelon(String name, double price, int quantity, Countries country) {
        super(name, price, quantity, country);
    }

    public Watermelon(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public void printLabelInformation() {
        super.printLabelInformation();
        System.out.println("Arbuzai taip pat skanus");
    }
}
