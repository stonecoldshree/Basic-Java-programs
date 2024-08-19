/* THIS JAVA PROGRAM CONTAINS 2ND TYPE OF LOOPING PROBLEMS BASED ON PATTERNS
THAT CAN BE PERFORMED WITH THEM USING LOOPS USING SWITCH CASE IN A SINGLE PROGRAM
 */
import java.util.*;
public class Looping_problems_part2 {
    public static void main(String[] args) {
        Scanner ob= new Scanner(System.in);
        System.out.print("Enter your choice:\t");
        String choice= ob.nextLine();

        switch(choice)
        {
            case "Rectangular pattern of '*' ":
                System.out.print("Enter the no. of rows:\t");
                int rows_1= ob.nextInt();
                System.out.print("Enter the no. of columns:\t");
                int column_1 = ob.nextInt();
                for(int a = 1; a <=rows_1; a++)
                {
                    for(int b = 1; b <= column_1; b++)
                    {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            break;
            case "Rectangular pattern of '*' with spaces in between":
                System.out.print("Enter the no. of rows:\t");
                int row_2= ob.nextInt();
                System.out.print("Enter the no. of columns:\t");
                int column_2= ob.nextInt();
                for(int i = 1; i<=row_2; i++ )
                {
                    for(int j=1; j<=column_2; j++)
                    {
                        if(i==1 || i==row_2 || j==1 || j==column_2)
                        {
                            System.out.print("*");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            break;
            case "Triangular pattern of '*' ":
                System.out.print("Enter the no. of rows:\t");
                int row_3 = ob.nextInt();
                for(int x=1; x<=row_3; x++)
                {
                    for(int y=1; y<=x; y++)
                    {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            break;
            case "Reverse triangular pattern of '*' ":
                System.out.print("Enter the no. of rows:\t");
                int row_4 = ob.nextInt();
                for(int c=row_4; c>=1; c--)
                {
                    for(int d = 1; d<=c; d++)
                    {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            break;
            case "Pyramid pattern of '*' ":
                System.out.print("Enter the no. of rows:\t");
                int row_5 = ob.nextInt();
                for(int k=1; k<=row_5; k++)
                {
                    for(int l=1; l<=row_5-k; l++)
                    {
                        System.out.print(" ");
                    }
                    for(int m=1; m<= (2*k-1); m++)
                    {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            break;
            case "Rectangular pattern of numbers":
                System.out.print("Enter the no. of rows:\t");
                int row_6= ob.nextInt();
                for(int p=1; p<=row_6; p++)
                {
                    for(int q=p; q<= row_6; q++)
                    {
                        System.out.print(q);
                    }
                    for(int r=1; r<=p-1; r++)
                    {
                        System.out.print(r);
                    }
                    System.out.println();
                }
            break;
            case "Rectangular pattern of numbers part2":
                System.out.print("Enter the no. of rows:\t");
                int row_7= ob.nextInt();
                System.out.print("Enter the no. of columns:\t");
                int column_7= ob.nextInt();
                for(int s=1; s<=row_7; s++)
                {
                    for(int t=1; t<=column_7; t++)
                    {
                        if((s+t)%2==0)
                        {
                            System.out.print(1);
                        }
                        else
                        {
                            System.out.print(2);
                        }
                    }
                    System.out.println();
                }
            break;
            case "Triangular pattern of numbers":
                System.out.print("Enter the no. of rows:\t");
                int row_8= ob.nextInt();
                for(int u=1; u<=row_8; u++)
                {
                    for(int v=1; v<=u; v++)
                    {
                        System.out.print(v);
                    }
                    System.out.println();
                }
            break;
            case "Pyramid pattern of numbers":
                System.out.print("Enter the no. of rows:\t");
                int row_9= ob.nextInt();
                for(int e = 1; e <=row_9; e++)
                {
                    for(int f = 1; f <=row_9 - e; f++)
                    {
                        System.out.print(" ");
                    }
                    for(int g = 1; g <= e; g++)
                    {
                        System.out.print(g);
                    }
                    for(int h= e-1; h>=1; h--)
                    {
                        System.out.print(h);
                    }
                    System.out.println();
                }
            break;
            case "Triangular pattern of numbers part2":
                System.out.print("Enter the no. of rows:\t");
                int row_10= ob.nextInt();
                for (int n = 1; n <= row_10; n++)
                {
                    for (int o = n; o < row_10; o++)
                    {
                        System.out.print(" ");
                    }
                    for (int w = 1; w <= 2 * n - 1; w++)
                    {
                        if ( n == row_10 ||w == 1 || w == 2 * n - 1)
                        {
                            System.out.print(n);
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
