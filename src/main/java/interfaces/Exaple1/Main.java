package interfaces.Exaple1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Swedbank swedbank = new Swedbank();
        Customer customer = new Customer(11);
        swedbank.consultCustomers();
        System.out.println(swedbank.calculateBankMargin(customer));


        Snoras snoras = new Snoras();
        snoras.consultCustomers();
        System.out.println(snoras.calculateBankMargin(customer));
        snoras.goBankrupt();
        List<EuropeanCentralBank> lietuvosBankai = new ArrayList<>();
        lietuvosBankai.add(swedbank);
        lietuvosBankai.add(snoras);

        for (EuropeanCentralBank bank : lietuvosBankai){
            bank.consultCustomers();
        }

    }
}
