package interfaces.Exaple1;

public class Swedbank implements EuropeanCentralBank{

    @Override
    public double calculateBankMargin(Customer customer) {
        if (customer.getCreditScore() > 10){
            //return customer.getCreditScore() > 10 ? 1.49 : 1.99; galima ir taip uzrasyti
            return 1.49 + getEuribor();
        }
        return 1.99 + getEuribor();
    }

    @Override
    public void consultCustomers() {
        System.out.println("Swedbankas konsultuoja klientus online. ");
    }
}
