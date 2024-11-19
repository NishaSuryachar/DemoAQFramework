package JavaPrograms;

public class LargestOfThreeNumbers
{
    public static void main(String[] args) {
        int a=10,b=40,c=30;
        if(a>b && a>c)
        {
            System.out.println("a is greater "+a);
        }
        else if(b>a && b>c)
        {
            System.out.println("b is greater "+b);
        }
        else
        {
             System.out.println("c is greater "+c);
        }
    }
}
