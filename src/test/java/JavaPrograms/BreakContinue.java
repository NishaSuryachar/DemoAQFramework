package JavaPrograms;

public class BreakContinue
{

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++)
        {
            if (i == 100)
            {
                System.out.println("Reached ,100 stopping the loop.");
                break;
            }

            if (i % 5 == 0)
            {
                System.out.println("Skipping " + i + ", because it is divisible by 5.");
                continue;
            }

            System.out.println("Processing " + i);
        }
    }
}
