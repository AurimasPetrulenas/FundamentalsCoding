package extendsExample1;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override //Anotacija pasakys programai, kad reikai sita perrasyti.
    public void makeSound() {
        System.out.println("Meow!");
    }

    /**
     * Purr angliskai reiskai murkti
     */
    public void purr() {
        System.out.println("Purrr purrrr...");
    }
}
