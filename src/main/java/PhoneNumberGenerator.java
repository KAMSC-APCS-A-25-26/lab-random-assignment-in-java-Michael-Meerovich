import java.util.Random;

public class PhoneNumberGenerator {
    public static void main(String[] args) {
        // TODO: Create Random object for phone number generation
        Random Rand = new Random();

        // TODO: Generate first three digits (XXX)
        // Constraint: Cannot contain 8 or 9 (digits 0-7 only)
        int num1 = Rand.nextInt(8);
        int num2 = Rand.nextInt(8);
        int num3 = Rand.nextInt(8);
        int num4, num5, num6, num7, num8, num9;

        // TODO: Generate second three digits (XXX) 
        // Constraint: Must be <= 742 (000-742)
        int num456 = Rand.nextInt(743);
        if (num456 < 10)
        {
            num4 = 0;
            num5 = 0;
            num6 = num456;
        }
        else if (num456 < 100)
        {
            num4 = 0;
            num5 = num456/10;
            num6 = num456-num5;
        }
        else
        {
            num4 = num456/100;
            num5 = (num456-num4)/10;
            num6 = num456-num4-num5;
        }

        // TODO: Generate third three digits (XXX)
        // No constraints (000-999)
        int num789 = Rand.nextInt(1000);
        if (num456 < 10)
        {
            num7 = 0;
            num8 = 0;
            num9 = num789;
        }
        else if (num456 < 100)
        {
            num7 = 0;
            num8 = num789/10;
            num9 = num789-num8;
        }
        else
        {
            num7 = num789/100;
            num8 = (num789-num7)/10;
            num9 = num789-num7-num8;
        }
        
        // TODO: Format and display phone number as XXX-XXX-XXX
        // Include the dashes in the output
        System.out.print ("" + num1 + num2 + num3 + "-" + num4 +num5 + num6 + "-" + num7 + num8 + num9);
    }
}
