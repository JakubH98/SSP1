import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        while(true) {
            int randomChoice = random.nextInt(3);
            String[] npcChoices = {"Rock", "Paper", "Scissors"};
            String playerChoice;

            while (true) {
                System.out.print("Rock, Paper, Scissors!:");
                playerChoice = scanner.nextLine();
                if (playerChoice.equalsIgnoreCase("Rock")
                        || playerChoice.equalsIgnoreCase("Paper")
                        || playerChoice.equalsIgnoreCase("Scissors")) {
                    break;
                }
                System.out.println("Please enter Rock, Paper, or Scissors.");
            }
            System.out.println("You chose: " + playerChoice);
            System.out.println("Computer chose: " + npcChoices[randomChoice]);
            if (playerChoice.equalsIgnoreCase(npcChoices[randomChoice]))
            {
                System.out.println("It's a tie.");
            }
            else if (playerChoice.equalsIgnoreCase("Rock"))
            {
                if (npcChoices[randomChoice].equalsIgnoreCase("paper"))
                {
                    System.out.println("You lose.");
                }
                else if (npcChoices[randomChoice].equalsIgnoreCase("scissors"))
                {
                    System.out.println("You win.");
                }
            }
            else if (playerChoice.equalsIgnoreCase("paper"))
            {
                if (npcChoices[randomChoice].equalsIgnoreCase("scissors"))
                {
                    System.out.println("You lose.");
                }
                else if (npcChoices[randomChoice].equalsIgnoreCase("rock"))
                {
                    System.out.println("You win.");
                }
            }
            else if (playerChoice.equalsIgnoreCase("scissors"))
            {
                if (npcChoices[randomChoice].equalsIgnoreCase("rock"))
                {
                    System.out.println("You lose.");
                }
                else if (npcChoices[randomChoice].equalsIgnoreCase("paper"))
                {
                    System.out.println("You win.");
                }
            }
            System.out.println("Play again? Y/N");
            String playAgain = scanner.nextLine();
            if(!playAgain.equalsIgnoreCase("y"))
            {
                break;
            }
        }
    }
}