package extendsExample1;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    /**
     * Overridinam (uzrasom ant virsaus) paveldeta tevines klases funkcionaluma.
     */
    @Override
    public void makeSound() {
        System.out.println("Woof woof!");
    }

    /**
     * Specifinis Dog klases elgesys
     */
    public void growl() {
        System.out.println("Grrrr....!");
    }
}
