package Polymorphism;

public class Client {
    public static void main(String[] args) {
        Animal animal = new Fish();
        animal.breath();

        Fish myFish = (Fish)animal;
        myFish.breath();
        myFish.jump();
        myFish.swim();
    }
}
