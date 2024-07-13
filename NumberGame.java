import java.util.Scanner;

public class NumberGame {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int numberToBeGuess = (int) (Math.random() * 100) + 1; 
    int Guesses = 5; 

    System.out.println("Welcome to the Number Game!");

    while (Guesses > 0) {
      System.out.printf("Guess a number between 1 and 100 (You have %d guesses remaining): ", Guesses);
      int guess = scanner.nextInt();

      if (guess == numberToBeGuess) {
        System.out.println("Congratulations! You guessed the number!");
        break;
      } else if (guess < numberToBeGuess) {
        System.out.println("Your guess is too low.");
      } else {
        System.out.println("Your guess is too high.");
      }

      Guesses--;
    }

    if (Guesses == 0) {
      System.out.println("You are out of guesses. The number was: " + numberToBeGuess);
    }

    scanner.close(); 
  }
}