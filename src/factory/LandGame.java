package factory;

public class LandGame implements Game{
    private int numberOfPlayers;
    private String gameTitle;

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public String getGameTitle() {
        return gameTitle;
    }

    public void setGameTitle(String gameTitle) {
        this.gameTitle = gameTitle;
    }

    public LandGame(int numberOfPlayers, String gameTitle) {
        this.numberOfPlayers = numberOfPlayers;
        this.gameTitle = gameTitle;
    }

    @Override
    public void printGameInfo() {
        System.out.println("Loja ne natyre " + gameTitle);
        System.out.println("Numri i lojtarëve " + numberOfPlayers);
    }

    @Override
    public void play() {
        System.out.println("Loja në natyrë " + gameTitle + " me " + numberOfPlayers + " lojtare");
    }
}
