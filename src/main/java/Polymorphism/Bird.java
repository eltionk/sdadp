package Polymorphism;

public class Bird extends SkyAnimal {
    public void sing () {
        System.out.println("Këndon");
    }

    @Override
    public void breath() {
        System.out.println("Merr Fryme me hundë");
    }

    @Override
    public void fly () {
        System.out.println("Fluturon");
    }
}
