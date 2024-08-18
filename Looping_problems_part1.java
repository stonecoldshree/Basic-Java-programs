/* THIS JAVA PROGRAM CONTAINS 1ST TYPE OF LOOPING PROBLEMS BASED ON NUMBERS
AND LOGICAL OPERATIONS THAT CAN BE PERFORMED WITH THEM USING LOOPS
 */
import java.util.*;
public class Looping_problems_part1 {
    public static void main(String[] args) {
        Scanner ob= new Scanner(System.in);
        System.out.print("Enter your choice:\t");
        String choice=ob.nextLine();

        switch(choice)
        {
            case "Count the digits":
                System.out.print("Enter any no. of your choice:\t");
                int num1 = ob.nextInt();
                int original_num1 = num1;
                int counter=0;
                while(num1 >0)
                {
                    num1=num1/10;
                    counter++;
                }
                System.out.println("No. of digits in "+original_num1 +" is: "+counter);
            break;
            case "Sum of the digits":
                System.out.print("Enter any no. of your choice:\t");
                int num2 = ob.nextInt();
                int original_num2 = num2;
                int d,s=0;
                while(num2>0)
                {
                    d=num2%10;
                    s=s+d;
                    num2=num2/10;
                }
                System.out.println("Sum of the digits of "+original_num2+" is: "+s);
            break;
            case "Reverse of a given number":
                System.out.print("Enter any no. of your choice:\t");
                int num3 = ob.nextInt();
                int original_num3 = num3;
                int digit,reverse=0;
                while(num3>0)
                {
                    digit=num3%10;
                    reverse=(reverse*10)+digit;
                    num3=num3/10;
                }
                System.out.println("Reverse of "+original_num3+" is: "+reverse);
            break;
            case "Sum of 1-2+3-4+5-6...n":
                System.out.print("Enter the limit:\t");
                int limit=ob.nextInt();
                int sum=0;
                for(int i=1;i<=limit;i++)
                {
                    if(i%2==0)
                    {
                        sum=sum-i;
                    }
                    else
                    {
                        sum=sum+i;
                    }
                }
                System.out.println("Sum of following series is: "+sum);
            break;
            case "First n factorial":
                System.out.print("Enter the limit:\t");
                int limit1=ob.nextInt();
                int factorial=1;
                for(int i=1;i<=limit1;i++)
                {
                    factorial=factorial*i;
                }
                System.out.println("Factorial of first "+limit1+" nos. is: "+factorial);
            break;
            case "Finding a to the power of b":
                System.out.print("Enter the base :\t");
                int a = ob.nextInt();
                System.out.print("Enter the power index :\t");
                int b = ob.nextInt();
                int c=1;
                for(int i=1; i<=b; i++)
                {
                    c*=a;
                }
                System.out.println(a+" raised to the power of "+b+" is: "+c);
            break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
