package JavaPrograms;

public class SkipTheEvenNumbers
{
    public static void main(String[] args) {
        int number=50;
        for(int i=1;i<=number;i++)
        {
            if(i<=20)
            {
                if(i%2!=0)
                {
                    System.out.println(i);
                }
            }

        }
    }
}
