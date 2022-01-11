package enumsExample2;

public enum GameLevel {

    EASY(300, "Golden", "Easy"),
    MEDIUM(200, "Iron", "Medium"),
    HARD(100, "Wooden", "Hard"),
    EXTREME(50, "Cloth", "Extreme");

    final int healthPoints;
    final String armorTypes;
    final String levelName;

    GameLevel(int healthPoints, String armorTypes, String levelName) {
        this.healthPoints = healthPoints;
        this.armorTypes = armorTypes;
        this.levelName = levelName;
    }

    @Override
    public String toString() {
        return "GameLevel{" +
                "healthPoints=" + healthPoints +
                ", armorTypes='" + armorTypes + '\'' +
                ", levelName='" + levelName + '\'' +
                '}';
    }
}
