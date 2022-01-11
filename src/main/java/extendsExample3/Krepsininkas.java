package extendsExample3;

public class Krepsininkas extends Sportininkai {
    public Krepsininkas(String name){
        super(name);
    }

    public Krepsininkas() {
        super();
    }
    @Override
    public void geraiMetaTritaskius() {
        System.out.println("Snaiperis");
    }
}

