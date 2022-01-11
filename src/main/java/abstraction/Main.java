package abstraction;

public class Main {
    public static void main(String []args) {

        Iphone iphone7 = new Iphone("Iphone 7 series");
        PhoneRepairService phoneRepairService = new PhoneRepairService();
        phoneRepairService.repair(iphone7);

        Samsung samsung10 = new Samsung("Samsung 10");
        phoneRepairService.repair(samsung10);

        Motorola motorola = new Motorola("MH Razor");
        Nokia nokia = new Nokia("3310");
        phoneRepairService.repairAnyPhone(motorola);
        phoneRepairService.repairAnyPhone(nokia);


    }
    }

