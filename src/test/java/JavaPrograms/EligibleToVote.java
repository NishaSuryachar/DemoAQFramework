package JavaPrograms;

import java.util.Scanner;

public class EligibleToVote
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter the age");
            int votes = sc.nextInt();
            if(votes >= 18)
            {
                System.out.println("You are eligible to vote");
            }
            else
            {
                System.out.println("You are not eligible to vote");
            }
        }

    }
}
