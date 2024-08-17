/* THIS JAVA PROGRAM IS TO UNDERSTAND THE USE OF DIFFERENT
ITERATIVE STATEMENTS AVAILABLE IN JAVA USING
MY FAVOURITE SWITCH CASE IN A SINGLE PROGRAM
 */
import java.util.*;
public class Loops
{
    public static void main(String[] args) {
        Scanner ob= new Scanner (System.in);
        System.out.print("Enter your choice: ");
        String choice= ob.nextLine();

        switch(choice)
        {
            case "While loop":
                System.out.print("Enter the limit: ");
                int n=ob.nextInt();
                int sum=0;
                int a=1;
                while(a <= n)
                {
                    sum=sum+a;
                    a++;
                }
                System.out.println("Sum of first 10 natural nos. is " +sum);
            break;
            case "For loop":
                System.out.print("Enter the limit: ");
                int m=ob.nextInt();
                int s=0;
                for(int i=1;i<=m;i++)
                {
                    if(i%2==0)
                    {
                        s=s+i;
                    }
                    else
                    {
                        s=s-i;
                    }
                }
                System.out.println("Required result is "+s);
            break;
            case "Do while loop":
                System.out.print("Enter the limit: ");
                int o=ob.nextInt();
                int su=0;
                int b=2;
                do
                {
                    if(b%2==0)
                    {
                        su=su+b;
                    }
                    b++;
                }while(b<=o);
                System.out.println("Required sum is: "+su);
            break;
            case "Break statement demonstration":
                System.out.print("Enter the limit: ");
                int p=ob.nextInt();
                for(int j= 1; j<=p;j++)
                {
                    if(j%5==0 && j%7==0)
                    {
                        System.out.println("Required result is "+j);
                        break;
                    }
                }
            break;
            case "Continue statement demonstration":
                System.out.print("Enter the limit: ");
                int q=ob.nextInt();
                int c=1;
                while(c<=q)
                {
                    if(c%2==0)
                    {
                        c++;
                        continue;
                    }
                    System.out.println(c);
                    c++;
                }
            break;
            default:
                System.out.println("invalid choice");

        }
    }
}
