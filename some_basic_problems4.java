//This java program consists of some  additional pattern based problems
import java.util.*;
public class some_basic_problems4
{
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter your choice:\t");
        int choice=ob.nextInt();
        switch(choice) {
            case 1:
                int a=1;
                for (int i = 1; i<=5; i++)
                {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(a+" ");
                        a=a+2;
                    }
                    System.out.println();
                    a=i*2+1;
                }
            break;
            case 2:
                for (int k = 1; k <= 5; k++) {
                    for (int l = 1; l <= 5; l++) {
                        System.out.print(k);
                    }
                    System.out.println();
                }
                break;
            case 3:
                int b=1;
                for (int m = 1; m <= 5; m++) {
                    for (int n = 1; n <= m; n++) {
                        System.out.print(b+" ");
                        b++;
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("invalid choice");

        }
    }
}
