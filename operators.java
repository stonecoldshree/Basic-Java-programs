/* THIS JAVA PROGRAM IS TO UNDERSTAND THE USE OF DIFFERENT OPERATORS
AVAILABLE IN JAVA */

public class operators
{
    public static void main(String[] args) {
        //ARITHMETIC OPERATORS
        int p=20, q=10;
        System.out.println(p+q);//30
        System.out.println(p-q);//10
        System.out.println(p/q);//2
        System.out.println(p*q);//200
        System.out.println(p%q);//0

        //RELATIONAL OPERATORS
        int a=10,b=10,c=20;
        System.out.println(a==b);//TRUE
        System.out.println(a!=b);//FALSE
        System.out.println(a>c);//FALSE
        System.out.println(a<c);//TRUE
        System.out.println(a>=b);//TRUE
        System.out.println(a<=c);//TRUE

        //LOGICAL OPERATORS
        int x=2,y=3,z=4;
        System.out.println(x<y && y>z);//FALSE
        System.out.println(x<y || y>z);//TRUE
        System.out.println(!(y<z));//FALSE

        //UNARY OPERATORS
        int d=5,e=6;
        System.out.println(d++);//5
        System.out.println(d);//6
        System.out.println(++e);//7
        System.out.println(e);//7
    }
}
