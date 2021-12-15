package extendsExample2;

import java.util.ArrayList;
import java.util.List;

public class WorkersMain {
    public static void main(String[] args) {
        Doctor tomas = new Doctor("Tomas");
        System.out.println("Doctor Tomas:");
        tomas.goingToWork();
        tomas.treatsPeople();
        tomas.makeMoney();

        System.out.println("______________________");

        Developer bill = new Developer("Bill");
        System.out.println("Developer Bill:");
        bill.goingToWork();
        bill.developsApplications();
        bill.makeMoney();

        System.out.println("______________________");

        Driver bob = new Driver("Bob");
        System.out.println("Driver Bob:");
        bob.goingToWork();
        bob.drivingTaxi();
        bob.makeMoney();

        System.out.println("______________________");

        List<Doctor> doctors = new ArrayList<>();
        doctors.add(tomas);


        List<Worker> workers = new ArrayList<>();
        workers.add(tomas);
        workers.add(bill);
        workers.add(bob);

        System.out.println();
        System.out.println();

        for (Worker worker : workers) {
            worker.goingToWork();
            worker.makeMoney();
            if (worker instanceof Driver) {
                ((Driver) worker).drivingTaxi();
            }
        }
    }
}



