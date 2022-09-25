package decorator;

public class Pistolete implements Arme{

    @Override
    public void shoot() {
        System.out.println("Pam Pam");
    }
}
