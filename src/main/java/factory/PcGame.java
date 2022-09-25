package factory;

public class PcGame implements Game{
    private String title;
    private boolean isOnline;
    private int numberOfPlayers;

    public String getTitle() {
        return title;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public PcGame(String title, boolean isOnline, int numberOfPlayers) {
        this.title = title;
        this.isOnline = isOnline;
        this.numberOfPlayers = numberOfPlayers;
    }

    @Override
    public void printGameInfo() {
        System.out.println("Loja elektronike: " + this.title);
        System.out.println("Numri i lojtarëve " + this.numberOfPlayers);
        System.out.println("Loja luhet online?" + this.isOnline);
    }

    @Override
    public void play() {
        System.out.println("Loja elektronike: " + this.title + " filloi...");
    }
}
