package abstractionFruitPerPaskaitaTask1;

public class Banana extends Fruit {
    public Banana(String name, double price, int quantity, Countries country) {
        super(name, price, quantity, country);
    }

    public Banana(String name, double price, int quantity) {
        super(name, price, quantity);
    }
    //be Override printLablinformation metodo, bet vis tiek ji turesiu pasiekti ir Fruit klases
}
