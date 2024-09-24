// This java program consists of some basic looping problems based on nos., sum of series and patterns
import java.util.*;
public class some_basic_problems3
{
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter your choice:\t");
        String choice= ob.nextLine();

        switch(choice)
        {
            case "Factorial":
                System.out.print("Enter the range:\t");
                int n= ob.nextInt();
                int f=1,s=0;
                for(int i=1;i<=n;i++)
                {
                    f=f*i;
                    s=s+f;
                }
                System.out.print("Sum of factorial of n numbers "+s);
            break;
            case "Pattern1":
                int s1=0;
                for(int i=5;i<=50;i=i+5)
                {
                    s1=((i*i)-1);
                    System.out.println(s1);
                }
            break;
            case "Pattern2":
                int p=0;
                for(int j=2;j<=20;j=j+2)
                {
                    if(j%4==0)
                    {
                        p=p-j;
                    }
                    else
                    {
                        p=p+j;
                    }
                }
                System.out.print("Required result:\t"+p);
            break;
            case "Pattern3":
                System.out.print("Enter any no. of your choice:\t");
                int x= ob.nextInt();
                double s2=0.0;
                for(int k=2;k<=20;k=k+3)
                {
                    s2=s2+(x/(double)k);
                }
                System.out.print("Required result:\t"+s2);
            break;
            case "Perfect":
                System.out.print("Enter any no. of your choice:\t");
                int a= ob.nextInt();
                int s3=0;
                for(int l=1;l<a;l++)
                {
                    if(a%l==0)
                    {
                        s3=s3+l;
                    }
                }
                if(a==s3)
                {
                    System.out.print(a+" is a perfect no.");
                }
                else
                {
                    System.out.print(a+" is not a perfect no.");
                }
            break;
            case "Pattern4":
                double s4=0.0;
                for(int m=0;m<=4;m++)
                {
                    s4=s4+(Math.pow(10,m));
                    System.out.println("Required pattern is:"+s4);
                }
            break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
