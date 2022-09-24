package factory;

public class BoardGame implements Game{
    private String title;
    private int numberOfPlayers;

    public String getTitle() {
        return title;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public BoardGame(String title, int numberOfPlayers) {
        this.title = title;
        this.numberOfPlayers = numberOfPlayers;
    }

    @Override
    public void printGameInfo() {
        System.out.println("Loja " + this.title);
        System.out.println("Numri i Lojtarëve " + this.numberOfPlayers);
    }

    @Override
    public void play() {
        System.out.println("Loja " + this.title + "me " + this.numberOfPlayers + " filloi...");
    }
}
