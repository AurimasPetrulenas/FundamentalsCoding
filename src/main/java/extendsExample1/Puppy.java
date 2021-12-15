package extendsExample1;

public class Puppy extends Animal {
    public Puppy(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Au Au");
    }

    @Override
    public void breathe() {
        super.breathe();
    }
 public void growl(){
     System.out.println("Grrrrrrrr");
 }

 }
