/* THIS IS A SIMPLE ROCK, PAPERS AND SCISSORS GAME IN JAVA WHICH IS PLAYED ONLY ONCE.
PLAYER'S CHOICE SHOULD MATCH WITH COMPUTER'S CHOICE TO WIN THE GAME
 */
import java.util.*;
public class Rock_paper_scissors
{
    public static void main(String[] args)
    {
        Scanner ob= new Scanner(System.in);
        Random random = new Random();

        String[] rps = {"Rock", "Paper", "Scissors"};
        String computerChoice = rps[random.nextInt(3)];
        System.out.println("Welcome to Rock, papers and scissors game\n"+"Enter your choice amongst the three\t");
        String choice= ob.nextLine();
        switch(choice)
        {
            case "Rock":
                if(choice.equals(computerChoice))
                {
                    System.out.println("IT'S A TIE BROTHA");
                }
                else if(computerChoice.equals("Paper") || computerChoice.equals("Scissors"))
                {
                    System.out.println("YOU LOST BROTHA TRY AGAIN");
                }
                else
                {
                    System.out.println("DAMN SON YOU WON");
                }
                break;
            case "Paper":
                if(choice.equals(computerChoice))
                {
                    System.out.println("IT'S A TIE BROTHA");
                }
                else if(computerChoice.equals("Rock") || computerChoice.equals("Scissors"))
                {
                    System.out.println("YOU LOST BROTHA TRY AGAIN");
                }
                else
                {
                    System.out.println("DAMN SON YOU WON");
                }
                break;
            case "Scissors":
                if(choice.equals(computerChoice))
                {
                    System.out.println("IT'S A TIE BROTHA");
                }
                else if(computerChoice.equals("Rock") || computerChoice.equals("Paper"))
                {
                    System.out.println("YOU LOST BROTHA TRY AGAIN");
                }
                else
                {
                    System.out.println("DAMN SON YOU WON");
                }
                break;
            default:
                System.out.println("INVALID CHOICE");
        }
        System.out.print("Computer's choice was:\t"+computerChoice);
    }
}
