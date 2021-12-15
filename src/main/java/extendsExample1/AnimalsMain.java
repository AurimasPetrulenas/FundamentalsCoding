package extendsExample1;

import java.util.ArrayList;
import java.util.List;

public class AnimalsMain {
    public static void main(String[] args) {
        Dog rexas = new Dog("Rexas");
        rexas.makeSound(); //Kaip ir betkoks gyvunas leidzia garsa
        rexas.growl(); //Urzgia tik kaip SUO. Kiti gyvnunai urgzti negali, nebent extendina Dog klase.
        rexas.breathe();

        System.out.println("_________________________");
        Puppy gile = new Puppy("Gile");
        gile.makeSound();
        gile.growl();
        gile.breathe();
        System.out.println("-------------------------");

        Cat kleopatra = new Cat("Cleo");
        kleopatra.makeSound(); //Kaip ir betkoks gyvunas leidzia garsa, taciau SAVAIP, kaip katinas. (Overriden)
        kleopatra.purr(); //Specifinis Cat klases elgesys.
        kleopatra.breathe();

        System.out.println("_________________________");

        Duck donald = new Duck("Donald");
        donald.makeSound();
        donald.fly();
        donald.breathe();

        List<Dog> dogs = new ArrayList<>();
        dogs.add(rexas); //Galiu prideti suniuka
        //dogs.add(kleopatra); //Katino prideti negaliu, nes sarasas yra skirtas sunims.

        List<Animal> animals = new ArrayList<>();
        animals.add(rexas);
        animals.add(kleopatra);
        animals.add(donald);

        System.out.println();
        System.out.println();

        for (Animal animal : animals) {
            animal.makeSound();
            if (animal instanceof Duck) {
                ((Duck) animal).fly();
            }
        }

    }
}


