package robotSample;

/**
 * brezinys atvazuojantis papildini - robotSample.Addon
 */
public class Addon {

    private int price;
    private String name;

    //Alt + insert ir pasirenku constructor ar kita reikiama komanda
    public Addon(int price, String name) {
        this.price = price;
        this.name = name;
    }
    // Accsesorius nuo zodzio access - pasiekti
    public int getPrice() {
        return price;
    }
    // mutatorius nuo zodzio mutate - mutuoti/pakeisti reiskme
    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "robotSample.Addon{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
