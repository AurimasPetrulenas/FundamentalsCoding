package enumsExample2;

public class GameMain {

    public static void main(String []args){
        Game game = new Game();
        game.setName("Duke Nukem 3");
        game.setGameLevel(GameLevel.EXTREME);// kai pakeiciam lygi viskas pasikeicia

        System.out.println("Zaidimo pavadinas: " + game.getName());
        final GameLevel gameLevel = game.getGameLevel();
        System.out.println("Zaidimo lygis: " + gameLevel.levelName);
        System.out.println("Jus turesite " + gameLevel.healthPoints + " gyvybes tasku ");
        System.out.println("Jusu sarvu tipas: " + gameLevel.armorTypes);

        System.out.println();
        System.out.println(gameLevel.toString());
    }
}
