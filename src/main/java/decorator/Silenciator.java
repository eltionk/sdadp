package decorator;

public class Silenciator extends Aksesore{
    public Silenciator (Arme arme){
        this.arme=arme;
    }
    @Override
    public void shoot() {
        this.arme.shoot();
        System.out.println("Sot nuk u dëgjua");
    }
}
