// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose your pet type:\n1. Dog\n2. Cat");
        int petType = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter your pet's name: ");
        String name = scanner.nextLine();

        VirtualPet pet;
        if (petType == 1) {
            pet = new Dog(name);
        } else {
            pet = new Cat(name);
        }

        System.out.println("\nWelcome to the Virtual Pet Simulator!");
        System.out.println("Your pet's name is " + name + ".");

        while (true) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Feed " + name);
            System.out.println("2. Play with " + name);
            System.out.println("3. Put " + name + " to sleep");
            System.out.println("4. Exit");
            System.out.print("Enter Your Choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> pet.feed();
                case 2 -> pet.play();
                case 3 -> pet.sleep();
                case 4 -> {
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }

            System.out.println(pet.getStatus());
        }
    }
}
