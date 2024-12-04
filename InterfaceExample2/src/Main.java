public class Main {
    public static void main(String[] args) {

        Animal bird = new Bird("Parrot");
        bird.makeSound();
        bird.move();

        Animal fish = new Fish("Goldfish");
        fish.makeSound();
        fish.move();
    }
}