public class PalindromeStringAndNumber
{
    public static void StringPalindrome(String str)
    {
        String rev="";
        for (int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        if(rev.equals(str))
        {
          System.out.println("String is Palindrome");
        }
        else {
            System.out.println("String is Not a palindrome");
        }
    }
    public static void NumberPalindrome(int num)
    {
        int temp=num;
        int rev=0;
        while(num!=0)
        {
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(rev==temp)
        {
            System.out.println("Number is Palindrome");
        }
        else
        {
            System.out.println("Number is Not Palindrome");
        }

    }
    public static void main(String[] args)
    {
        StringPalindrome("madam");
        NumberPalindrome(121);
    }

}
