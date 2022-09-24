package Polymorphism;

public class Fish extends SeaAnimal {
    public void jump () {
        System.out.println("Kërcen");
    }

    @Override
    public void breath() {
        System.out.println("Merr Fryme Velëza");
    }

    @Override
    public void swim() {
        System.out.println("Noton");
    }

}