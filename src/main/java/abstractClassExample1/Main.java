package abstractClassExample1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Lektuvas lektuvas = new Lektuvas(1000);
        Automobilis automobilis = new Automobilis(190);
        MotorineValtis motorineValtis = new MotorineValtis(80);

        List<TransportoPriemone> transportoPriemones = List.of(lektuvas, automobilis, motorineValtis);

        for (TransportoPriemone transportoPriemone : transportoPriemones){
            transportoPriemone.turnOnEngine();
            transportoPriemone.move();
            System.out.println();
        }
    }
}
