package abstractionFruitPerPaskaitaTask1;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class Fruit {
    private String name;
    private double price;
    private  int quantity;
    private Countries country;

    public Fruit(String name, double price, int quantity) {
    }


    public void printLabelInformation(){
        System.out.println("_______________");
        System.out.println("Fruit name:" + name);
        System.out.println("Fruit price" + price);
        System.out.println("Fruit quantity" + quantity);
        System.out.println(country.getCountryInfo());
        System.out.println("_______________");

    }

}
