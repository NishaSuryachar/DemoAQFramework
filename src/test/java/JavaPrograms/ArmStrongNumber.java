package JavaPrograms;

public class ArmStrongNumber
{
    public static void main(String[] args) {
        int start=1,end=1000;
        for(int i=start;i<=end;i++)
        {
            int temp=i;
            int sum=0;
            while(temp>0)
            {
                int rem=temp%10;
                rem=rem*rem*rem;
                sum=sum+rem;
                temp=temp/10;
            }
            if(i==sum)
            {
                System.out.println(i);
            }
            }

        }
    }
