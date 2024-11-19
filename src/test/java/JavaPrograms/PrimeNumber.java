package JavaPrograms;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 50;
        System.out.println("Prime numbers between 1 and " + n + ":");
        for (int i = 2; i <= n; i++)
        {
            if (isPrime(i))
            {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isPrime(int num)
    {
        for (int i = 2; i <= num; i++)
        {
            if (num % i == 0)
            {
                return false;
            }
            return true;
        }
        return false;
    }
}



