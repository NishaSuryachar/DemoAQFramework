package JavaPrograms;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of times to flip the coin: ");
        int flips = scanner.nextInt();
        Random random = new Random();
        for (int i = 1; i <= flips; i++)
        {
            int flipResult = random.nextInt(2);
            if (flipResult == 0)
            {
                System.out.println("Flip " + i + ": Heads");
            }
            else
            {
                System.out.println("Flip " + i + ": Tails");
            }
        }

    }
}
