package abstractionFruiSavarankiskas;

public enum KilmesSalis {
    LIETUVA("Alyvinis obuolys ", 5, 2.5, "Lietuva"),
    PORTUGALIJA("Saldusi apelsinas ", 10, 3.99, "Portugalija");

    final String name;
    final int kiekis;
    final double kaina;
    final String kilmesSalis ;

    KilmesSalis(String name, int kiekis, double kaina, String kilmesSalis) {
        this.name = name;
        this.kiekis = kiekis;
        this.kaina = kaina;
        this.kilmesSalis = kilmesSalis;

    }
}
