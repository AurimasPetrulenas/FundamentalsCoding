package interfaces.Exaple1;
// abstrakcios klases pusbrolis
public interface EuropeanCentralBank {
    // du abstarktus metodai kaip ir abstrakcioje klaseje
    double calculateBankMargin(Customer customer);
    void consultCustomers();

    default double getEuribor() {
        return 0.01;
    }

}
