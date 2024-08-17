/* THIS JAVA PROGRAM IS TO UNDERSTAND THE USE OF DIFFERENT CONDITIONAL STATEMENTS
AVAILABLE IN JAVA IN A SINGLE PROGRAM USING SWITCH STATEMENT */

import java.util.*;
public class ConditionalStatements
{
    public static void main(String[] args) {
        Scanner ob= new Scanner(System.in);
        System.out.print("Enter your choice \t");
        String choice= ob.nextLine();

        switch(choice)
        {
            case "If statement":
                int a=10,b=20;
                if(a>b)
                {
                    System.out.println("TRUE");
                }
            break;
            case "If Else":
                int c=20,d=30;
                if(c<d)
                {
                    System.out.println("TRUE");
                }
                else
                {
                    System.out.println("False");
                }
            break;
            case "Ternary":
                int p=30,q=40;
                String result=(p<q)?"TRUE":"FALSE";
                System.out.println(result);
            break;
            case "If Else If":
                int x=2,y=3,z=4;
                if (x>y)
                {
                    System.out.println("TRUE");
                }
                else if (x<z)
                {
                    System.out.println("TRUE");
                }
                else
                {
                    System.out.println("NO OUTPUT");
                }
            break;
            case "Nested If Else":
                System.out.print("Enter a no.:\t");
                int r=ob.nextInt();
                if(r>0)
                {
                    if(r%2==0)
                    {
                        System.out.println(r+ "\t is an even no.");
                    }
                    else
                    {
                        System.out.println(r+ "\t is an odd no.");
                    }
                }
                else
                {
                    System.out.println("Not a natural no.");
                }
            break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
