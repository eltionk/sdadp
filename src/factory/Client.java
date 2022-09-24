package factory;

public class Client {
    public static void main(String[] args) {
        GameTypeEnum gameType = GameTypeEnum.LAND;

        Game game = null;

        switch (gameType){
            case BOARD -> game = new BoardGame("Murlan", 4);
            case PC -> game = new PcGame("Counter Strike", true, 5);
            case LAND -> game = new LandGame(2, "Tenis");
        }

        game.printGameInfo();
        game.play();
    }
}
