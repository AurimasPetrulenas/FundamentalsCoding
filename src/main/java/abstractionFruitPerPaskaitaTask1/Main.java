package abstractionFruitPerPaskaitaTask1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Orange orange = new Orange("Nice orange ", 2.5, 2, Countries.SPAIN);
        orange.printLabelInformation();

        Watermelon watermelon = new Watermelon("Watermelon ", 2.5, 2, Countries.ITALY);
        watermelon.printLabelInformation();

        Banana banana = new Banana("Banana ", 3, 9, Countries.POLAND);
        banana.printLabelInformation();

        List<Fruit> vaisiai = new ArrayList<>();
        vaisiai.add(orange);
        vaisiai.add(watermelon);
        vaisiai.add(banana);

        //arba galima taip parasiti . List<Fruit> vaisiai = List.of(orange, watremelon, banana);

        FruitShipingService serice = new FruitShipingService();

        for (Fruit vaisius : vaisiai) {
            serice.shipFruit(vaisius);
        }
    }
}
