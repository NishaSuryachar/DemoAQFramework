package JavaPrograms;

import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
        System.out.println("Enter your option: ");
        int option = sc.nextInt();
        switch (option)
            {
                case 1:
                {
                    System.out.println("Enter first number: ");
                    int firstNumber = sc.nextInt();
                    System.out.println("Enter second number: ");
                    int secondNumber = sc.nextInt();
                    int sum = firstNumber + secondNumber;
                    System.out.println("The sum is: " + sum);
                    break;
                }
                case 2:
                {
                    System.out.println("Enter first number: ");
                    int firstNumber = sc.nextInt();
                    System.out.println("Enter second number: ");
                    int secondNumber = sc.nextInt();
                    int sub = firstNumber - secondNumber;
                    System.out.println("The Substraction is: " + sub);
                    break;
                }
                case 3:
                {

                    System.out.println("Enter first number: ");
                    int firstNumber = sc.nextInt();
                    System.out.println("Enter second number: ");
                    int secondNumber = sc.nextInt();
                    int mul = firstNumber * secondNumber;
                    System.out.println("The sum is: " + mul);
                    break;
                }
                case 4:
                {
                    try{
                        System.out.println("Enter first number: ");
                        int firstNumber = sc.nextInt();
                        System.out.println("Enter second number: ");
                        int secondNumber = sc.nextInt();
                        int div = firstNumber / secondNumber;
                        System.out.println("The sum is: " + div);
                        break;
                    }
                    catch (ArithmeticException e)
                    {
                        System.out.println("Arithmetic exception Handled");
                    }

                }
                default:
                {
                    System.out.println("Invalid option");

                }
            }
        }

        }
    }

