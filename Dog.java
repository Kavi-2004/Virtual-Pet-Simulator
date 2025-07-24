// Dog.java
public class Dog extends VirtualPet {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void play() {
        super.play();
        System.out.println(name + " fetched the ball happily!");
    }

    @Override
    public void feed() {
        super.feed();
        System.out.println(name + " wagged its tail while eating.");
    }

    @Override
    public void sleep() {
        energy = Math.min(10, energy + 3);
        hunger++;
        System.out.println(name + " curls up and takes a peaceful dog nap.");
    }

}

