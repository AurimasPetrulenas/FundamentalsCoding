package extendsExample3;

public class SportininkaiMain {
    public static void main(String[]args){
        Krepsininkas krepsininkas = new Krepsininkas();
        Krepsininkas milas = new Krepsininkas("Milas");
        System.out.println("Milas");
        milas.sportuoja();
        milas.dalyvaujaVarzybose();
        milas.zaidziaSuKamuoliu();
        milas.geraiMetaTritaskius();

        System.out.println("________________________");

        Futbolistas futbolistas = new Futbolistas();
        Futbolistas muller = new Futbolistas("Muller");
        System.out.println("Muller");
        muller.sportuoja();
        muller.dalyvaujaVarzybose();
        muller.zaidziaSuKamuoliu();
        muller.geraiMusaIvarcius();

        System.out.println("________________________");

        Plaukikas plaukikas = new Plaukikas();
        Plaukikas danas = new Plaukikas("Danas");
        System.out.println("Danas");
        danas.sportuoja();
        danas.dalyvaujaVarzybose();
        danas.plaukia();

        System.out.println("________________________");
    }
}
