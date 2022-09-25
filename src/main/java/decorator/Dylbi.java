package decorator;

public class Dylbi extends Aksesore{
    public Dylbi (Arme arme) {
        this.arme=arme;
    }

    @Override
    public void shoot() {
        System.out.println("Afron objektin");
        this.arme.shoot();
    }
}
