/* THIS JAVA PROGRAM IS TO UNDERSTAND HOW TO TAKE INPUT
IN JAVA USING SCANNER CLASS */

import java.util.*;
public class TakingInput
{
    public static void main(String[] args) {
        Scanner ob= new Scanner(System.in);
        System.out.println("Enter your name");
        String name= ob.nextLine();
        System.out.println("Enter your age");
        int age= ob.nextInt();
        System.out.println(name +"\tis\t" + age+ "\tyears old");
    }
}
