import java.util.Scanner;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random generator = new Random();
    
    int randomNumber = generator.nextInt(100);
    int userInput;
    boolean numberGuessed = false;

    while (!numberGuessed) {
      System.out.println("Please guess a number from 1 to 100");
      userInput = input.nextInt();

      if (userInput == randomNumber) {
          System.out.println("You guessed it!");
          numberGuessed = true;
      } else if (userInput < randomNumber) {
          System.out.println("That's too low. Guess a larger number.");
      } else {
          System.out.println("That's too high. Guess a smaller number.");
      }
    }
  input.close();
    }
}

