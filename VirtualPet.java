/*
import java.util.Scanner;

public class VirtualPet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String petName = "Fluffy";
        int hunger = 5; // 0 (not hungry) to 10 (very hungry)
        int happiness = 5; // 0 (sad) to 10 (very happy)
        int energy = 5; // range 0 - 10

        System.out.println("Welcome to the Virtual Pet Simulator!");
        System.out.println("Your pet's name is " + petName + ".");

        String[] responses = {
        petName + " wags its tail!",
        petName + " looks at you with big eyes!",
        petName + " seems bored...",
        petName + " does a little dance!",
        petName + " purrs softly."
        };

        while (true) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Feed " + petName);
            System.out.println("2. Play with " + petName);
            System.out.println("3. Put "+ petName + " to sleep");
            System.out.println("4. Exit");
            
            System.out.print("Enter Your Choice: ");
            
            int choice = scanner.nextInt();

            if (choice == 1) {  //FEED
                hunger = Math.max(0, hunger - 2);   // hunger is in the range of 0 to 10 so using math.max and it is the same for happiness
                happiness -= 1;
                energy = Math.max(0, energy - 1); 
                System.out.println(petName + " is less hungry now!");
                System.out.println(responses[(int)(Math.random() * responses.length)]);
            } 
            
            else if (choice == 2) {  // PLAY
                happiness = Math.min(10, happiness + 2);
                energy = Math.max(0, energy - 2);
                System.out.println(petName + " is happier now!");
                hunger+=1;
                System.out.println(responses[(int)(Math.random() * responses.length)]);
            } 
            
            else if (choice == 3) {
                energy = Math.min(10, energy + 3);  // this is to prevent it from going above 10 or  Math.max(0, energy-1) - to not go below 0
                System.out.println(petName + " took a good nap!");
                System.out.println(responses[(int)(Math.random() * responses.length)]);
            } 
            
            else if (choice == 4) {
                System.out.println("Goodbye!");
                break;
            } 
            
            else {
                System.out.println("Invalid choice. Try again.");
            }

            // Display pet status
            System.out.println("\nCurrent Status of " + petName + ":");
            System.out.println("Hunger: " + hunger + " / 10");
            System.out.println("Happiness: " + happiness + " / 10");
            System.out.println("Energy: " + energy + " / 10");

            if (hunger >= 9) {
                System.out.println(petName + " is starving! Feed soon!");
            }
            if (happiness <= 1) {
                System.out.println(petName + " feels very lonely!");
            }
            if (energy <= 1) {
                System.out.println(petName + " is exhausted!");
            }
        }

        scanner.close();
    }javac Main.java VirtualPet.java

}
*/

public abstract class VirtualPet {
    protected String name;
    protected int hunger;
    protected int happiness;
    protected int energy;

    public VirtualPet(String name) {
        this.name = name;
        this.hunger = 5;
        this.happiness = 5;
        this.energy = 5;
    }

    public void feed() {
        hunger = Math.max(0, hunger - 2);
        happiness++;
        System.out.println(name + " enjoyed the food!");
    }

    public void play() {
        happiness = Math.min(10, happiness + 2);
        hunger++;
        energy--;
        System.out.println(name + " had fun playing!");
    }

    public abstract void sleep();

    public String getStatus() {
        return "\nStatus of " + name + ":\nHunger: " + hunger + "/10\nHappiness: " + happiness + "/10\nEnergy: " + energy + "/10";
    }
}
