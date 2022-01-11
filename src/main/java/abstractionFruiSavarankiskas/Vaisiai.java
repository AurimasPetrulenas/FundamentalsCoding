package abstractionFruiSavarankiskas;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Vaisiai {
    private String name;
    private int kiekis;
    private double kaina;
    private String kilmesSalis;

    public void informacinisLapelis() {
        System.out.println("Vaisius " + name);
        System.out.println("Kiekis " + kiekis);
        System.out.println("Kaina " + kaina);
        System.out.println("Kilmes salis  " + kilmesSalis);

    }
}



