//This java program is check whether a given no. is prime or not.
import java.util.*;
public class some_basic_problems2
{
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter the no. to be checked:\t");
        int n= ob.nextInt();
        int i,count=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println(n+" is a prime no.");
        }
        else
        {
            System.out.println(n+" is not a prime no.");
        }
    }
}
