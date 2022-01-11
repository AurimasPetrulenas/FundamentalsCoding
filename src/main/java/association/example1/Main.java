package association.example1;

public class Main {

    public static void main(String[] args) {
        Heart heart = new Heart();
        heart.beat();
        heart.heartRate = 15;
        heart.size = 20;

        BionicArm bionicArm = new BionicArm();
        bionicArm.turnOn();

        Person person = new Person();
        person.bionicArm = bionicArm;
        person.heart = heart;

    }
}

