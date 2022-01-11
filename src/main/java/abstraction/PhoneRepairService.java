package abstraction;

public class PhoneRepairService {
    public void repair(Iphone iphone) {
        System.out.println("Repairing" + iphone.name);
    }

    public void repair(Samsung samsung) {
        System.out.println("Repairing" + samsung.name);
    }
    public void repairAnyPhone(Phone phone){
        System.out.println("Repair" + phone.name);
    }

}