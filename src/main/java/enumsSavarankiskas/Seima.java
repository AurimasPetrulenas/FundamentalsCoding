package enumsSavarankiskas;

public enum Seima {
    VYRAS("Aurimas", 41),
    ZMONA("Sandra", 40),
    VAIKAS("Elze", 12),
    SUO("Gile", 1);

    final String vardas;
    final int amzius;

    Seima(String vardas, int amzius) {
        this.vardas = vardas;
        this.amzius = amzius;
    }
}




