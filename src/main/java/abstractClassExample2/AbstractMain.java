package abstractClassExample2;

import java.util.ArrayList;
import java.util.List;

public class AbstractMain {
    public static void main(String[] args) {

        Duck duck = new Duck();
        System.out.println(duck.age);
        System.out.println(duck.name);
        System.out.println(duck.hasFeathers);
        duck.move();
        duck.breathe();
        duck.fly(); // galiu pasiekti tik tai klasei tinkanti metoda

        Animal anotherDuck = new Duck(); //tipas Animal o objektas Duck
        System.out.println(anotherDuck.age);
        System.out.println(anotherDuck.name);
        //System.out.println(anotherDuck.hasFeathers); negaliu pasiekti konkrecios DUCK klases lauko
        anotherDuck.move();
        anotherDuck.breathe();
        // anotherDuck.fly(); negaliu pasiekti sio metodo, nes jis priklauso tik DUCK klasei

        List<Animal> gyvunai = new ArrayList<>();
        gyvunai.add(duck);
        gyvunai.add(anotherDuck);

        gyvunai.forEach(animal -> animal.move());
        gyvunai.forEach(animal -> animal.breathe());
    }
}

abstract class Animal {
    //bendri laukai tinkantys visiems objektams
    int age;
    String name;

    abstract void move();

    void breathe() {
        System.out.println("Breathing ");
    }
}

class Duck extends Animal {

    boolean hasFeathers; //specifinis antino bruozas

    @Override
    void move() {
        System.out.println("Swimming ");
    }

    void fly() {
        System.out.println("only ducks can fly ");
    }
}