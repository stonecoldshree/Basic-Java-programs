/* THIA JAVA PROGRAM CONSISTS OF 4 VERY MIND BENDING PROBLEMS USING CONDITIONAL STATEMENTS.
I REALLY ENJOYED SOLVING THESE QUESTIONS. GOT CLEARED WITH CONDITIONAL STATEMENTS.
 */
import java.util.*;
public class some_basic_problems
{
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter your choice:\t");
        int choice=ob.nextInt();

        switch (choice)
        {

            case 1:
                System.out.print("Enter any number of your choice:\t");
                int n=ob.nextInt();
                if(n>0 && n%2==0)
                {
                    System.out.print("Succeeding 3 even nos after "+n+" are:\t"+(n+2)+","+(n+4)+","+(n+6));
                }
                else if(n>0 && n%2!=0)
                {
                    System.out.print("Succeeding 3 odd nos. before "+n+" are:\t"+(n+2)+","+(n+4)+","+(n+6));
                }
                else if(n<0 && n%2!=0)
                {
                    System.out.print("Preceding 3 odd nos. before "+n+" are:\t"+(n-2)+","+(n-4)+","+(n-6));
                }
                else
                {
                    System.out.println("Invalid no.");
                }
            break;
            case 2:
                ob.nextLine();
                System.out.print("Enter the student's name:\t");
                String stu_name =ob.nextLine();
                System.out.print("Enter the student's marks in Physics:\t");
                int phy=ob.nextInt();
                System.out.print("Enter the student's marks in Chemistry:\t");
                int chem=ob.nextInt();
                System.out.print("Enter the student's marks in Biology:\t");
                int bio=ob.nextInt();

                double avg=(phy+chem+bio)/3.0;
                String grade;
                if(avg>=80)
                {
                    grade="you got a distinction";
                }
                else if(avg>=60 && avg<80)
                {
                    grade="you got first division";
                }
                else if(avg>=45 && avg<60)
                {
                    grade="you got second division";
                }
                else if(avg>=40 && avg<45)
                {
                    grade="you are passed";
                }
                else
                {
                    grade="Sorry you are failed";
                }
                System.out.print(stu_name+" got "+avg+" and his grade is: "+grade);
            break;
            case 3:
                ob.nextLine();
                int amt,option;
                double d,rp,np=0.0,tax;
                System.out.print("Enter customer's name:\t");
                String cust_name=ob.nextLine();
                System.out.print("Enter the amount of purchase:\t");
                amt=ob.nextInt();
                System.out.print("Enter your choice 1 for AC and 2 for LCD:\t");
                option=ob.nextInt();
                if(option==1)
                {
                    if(amt<=20000)
                    {
                        d=(amt*5.0)/100.0;
                    }
                    else if(amt>20000 && amt<40000)
                    {
                        d=(amt*7.5)/100.0;
                    }
                    else if(amt>40000 && amt<60000)
                    {
                        d=(amt*10.0)/100.0;
                    }
                    else
                    {
                        d=(amt*12.0)/100.0;
                    }
                    rp=amt-d;
                    tax=(rp*12.5)/100.0;
                    np=rp+tax;
                }
                else if(option==2)
                {
                    if(amt<=20000)
                    {
                        d=(amt*2.5)/100.0;
                    }
                    else if(amt>20000 && amt<40000)
                    {
                        d=(amt*5.0)/100.0;
                    }
                    else if(amt>40000 && amt<60000)
                    {
                        d=(amt*7.0)/100.0;
                    }
                    else
                    {
                        d=(amt*8.5)/100.0;
                    }
                    rp=amt-d;
                    tax=(rp*12.5)/100.0;
                    np=rp+tax;
                }
                else
                {
                    System.out.println("Invalid choice");
                }
                System.out.print("Customer's name is:\t"+cust_name+"\n");
                System.out.print("Amount to be paid:\t"+np);
            break;
            case 4:
                ob.nextLine();
                System.out.print("Enter passenger's name:\t");
                String pass_name=ob.nextLine();
                System.out.print("Enter taxi no.:\t");
                String taxi_no=ob.nextLine();
                System.out.print("Enter the distance covered:\t");
                double dist=ob.nextDouble();
                double bill=0.0;
                double amt1,amt2=0.0,amt3=0.0,amt4=0.0;
                if(dist<=5.0)
                {
                    amt1=100.0;
                    bill=amt1;
                }
                else if(dist>5.0 && dist<=15.0)
                {
                    amt2=100.0+(10.0*(dist-5.0));
                    bill=amt2;
                }

                else if(dist>15.0 && dist<=25.0)
                {
                    amt3=100.0+((dist-15.0)*8.0)+100.0;
                    bill=amt3;
                }
                else
                {
                    amt4=100.0+180.0+(5.0*(dist-25.0));
                    bill=amt4;
                }
                System.out.print(pass_name+" drove in taxi with no. "+taxi_no+" has paid "+bill);
            break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
