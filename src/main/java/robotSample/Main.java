package robotSample;

public class Main {

    public static void main(String[] args) {
        // objekto tipas = klases konstruktorius
        Robot robotJimmy = new Robot();// konstruktorius sukuria atmintyje objketa

        robotJimmy.setName("Jimmy");
        robotJimmy.setPrice(500);
        robotJimmy.setSeriesNo(1);

        Addon goldenHelmet = new Addon(150, "golden_halmet");
        robotJimmy.setAddon(goldenHelmet);

        RobotFeature navigation = new RobotFeature("Google maps");
        RobotFeature spotify = new RobotFeature("spotify");
        RobotFeature tinder = new RobotFeature("tinder");
        RobotFeature[] jimmyFeatures = {navigation, spotify, tinder};

        System.out.println(robotJimmy);

    }
}

