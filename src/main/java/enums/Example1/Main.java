package enums.Example1;

public class Main {



    public static void main(String[] args) {
        DaysOfWeek day = DaysOfWeek.SESTADIENIS;
        System.out.println(day);

        for (DaysOfWeek singleDay : DaysOfWeek.values()) {
            System.out.println(singleDay);
        }

        boolean isOrderReceived = true;
        if (isOrderReceived) {
            PizzaStatus status = PizzaStatus.ORDERED;
            int pizzaStatus = 1; //turiu zinoti, kad 1 reiskia uzsakyta..
            makePizza(pizzaStatus);
            //....
        }

        System.out.println(TelevisionChannels.BTV.channelNumber);

        int userChannelSelection = 4;
        if (userChannelSelection == TelevisionChannels.BTV.channelNumber) {
            System.out.println("Ijungiam BTV");
            System.out.println("Kanalo kaina: " + TelevisionChannels.BTV.monthlyPrice);
        }

        for (TelevisionChannels currentChanels : TelevisionChannels.values()) {
            System.out.println(currentChanels);

        }

        }

    private static void makePizza(int pizzaStatus) {
        System.out.println("Pizza is made");
        pizzaStatus = 2; //turiu zinoti, kad 2 reiskia pagaminta pica


    }
}