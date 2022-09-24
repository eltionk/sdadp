package factory;

public class GameFactory {
    public Game crateGame (GameTypeEnum gameType) {
        Game game = null;
        switch (gameType){
            case BOARD -> game = new BoardGame("Murlan", 4);
            case PC -> game = new PcGame("Counter Strike", true, 5);
            case LAND -> game = new LandGame(2, "Tenis");
        }
        return game;
    }
}