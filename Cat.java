// Cat.java
public class Cat extends VirtualPet {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void play() {
        super.play();
        System.out.println(name + " chased a toy lazily!");
    }

    @Override
    public void feed() {
        super.feed();
        System.out.println(name + " purred while eating.");
    }

    @Override
    public void sleep() {
        energy = Math.min(10, energy + 3);
        hunger++;
        System.out.println(name + " curls up in a sunny spot and dozes off.");
    }

}
