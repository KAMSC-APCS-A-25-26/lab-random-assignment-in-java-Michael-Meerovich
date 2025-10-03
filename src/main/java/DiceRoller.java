import java.util.Random;

public class DiceRoller {
    public static void main(String[] args) {
        // TODO: Create Random objects for dice rolling
        // 1. Three Random objects without seeds (unseeded dice)
        Random rand1 = new Random();
        Random rand2 = new Random();
        Random rand3 = new Random();

        // 2. One Random object with any seed value (seeded die)
        Random randseed = new Random(534);

        // TODO: Generate random integers for dice rolls
        int dice1, dice2, dice3, dice4;
        dice1 = rand1.nextInt(6) + 1;
        dice2 = rand2.nextInt(6) + 1;
        dice3 = rand3.nextInt(6) + 1;
        dice4 = randseed.nextInt(6) + 1;

        // TODO: Display the dice rolls - 1-6
        // Show all four dice rolls with clear labels
        System.out.println ("Unseeded Die 1: " + dice1);
        System.out.println ("Unseeded Die 2: " + dice2);
        System.out.println ("Unseeded Die 3: " + dice3);
        System.out.println ("Seeded Die: " + dice4);

        // TODO: Demonstrate the difference between seeded and unseeded
        // Run the program multiple times to show seeded consistency
    }
}
