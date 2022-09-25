package decorator;

public class Client {
    public static void main(String[] args) {
        Arme pistolete = new Pistolete();
        Arme pistoleteSilenciator = new Silenciator(pistolete);
        pistoleteSilenciator.shoot();
        Arme pistoleteSilenciatorDylbi = new Dylbi(pistoleteSilenciator);
        pistoleteSilenciatorDylbi.shoot();
    }
}
