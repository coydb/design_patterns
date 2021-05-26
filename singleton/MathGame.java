import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

/**
 * A standalone Math Game
 * @author Coy Burke
 */
public class MathGame {
  private static MathGame mathGame;
  private int score = 0;
  private Random rand;
  private Scanner reader;
  private String[] operands = {"+", "-", "*", "/"};

  /**
   * Initializes the Random object and Scanner object
   * and prints a welcome message.
   */
  private MathGame() {
    rand = new Random();
    reader = new Scanner(System.in);
    System.out.println("Let's have fun with math!");
  }

  /**
   * Creates a new MathGame if one does not exist,
   * or provides access to the current instance if
   * one already exists. 
   * @return the current instance of MathGame
   */
  public static MathGame getInstance() {
    if(mathGame == null) {
      mathGame = new MathGame();
    }
    return mathGame;
  }

  /**
   * Starts a new round of the math game and continues
   * until the user chooses to quit.
   */
  public void play() {
    boolean playAgain = true;
    String userInput = "";

    while (playAgain) {
      System.out.print("(P)lay or (Q)uit: ");
      userInput = reader.nextLine().toLowerCase();
      switch (userInput) {
        case "p":
          if (playRound()) {
            score++;
          }
          break;
        case "q":
          playAgain = false;
          break;
        default:
          System.out.println("Sorry, you must enter p or q.");
          break;
      }
    }
    System.out.print("You won " + score);
    System.out.print(score == 1 ? " game!\n" : " games!\n");
    System.out.println("Goodbye.");
  }

  /**
   * Generates a random math question, prompts the user for a guess,
   * then determines if the user won the round or not.
   * @return True if the user won the round,
   *         False if the user lost the round
   */
  private boolean playRound() {
    int leftNumber = rand.nextInt(100)+1;
    int rightNumber = rand.nextInt(100)+1;
    String operand = operands[rand.nextInt(4)];

    System.out.println("\nRound answer to 1 decimal place.");
    System.out.print(leftNumber + operand + rightNumber + " = ");
    double userGuess = reader.nextDouble();
    reader.nextLine();
    return checkGuess(leftNumber, rightNumber, operand, userGuess);
  }

  /**
   * Performs the appropriate calculation based on the operator, 
   * and determines if the user's guess is correct.
   * @param leftNumber An int representing the number on the left of the operator
   * @param rightNumber An int representing the number on the right of the operator
   * @param operator A String representing the operator
   * @param userGuess A double representing the user's guess
   * @return True if the user's guess is correct,
   *         False if the user's guess is incorrect.
   */
  private boolean checkGuess(int leftNumber, int rightNumber, String operator, double userGuess) {
    double correctAnswer =0.0;
    String correct = "Correct!";
    String incorrect = "Incorrect. Correct answer: ";
    switch (operator) {
      case "+":
        correctAnswer = leftNumber + rightNumber;
        break;
      case "-":
        correctAnswer = leftNumber - rightNumber;
        break;
      case "*":
        correctAnswer = leftNumber * rightNumber;
        break;
      case "/":
        correctAnswer = ((double)leftNumber / (double)rightNumber);
        var rounder = new DecimalFormat("#.#");
        correctAnswer = Double.valueOf(rounder.format(correctAnswer));
        break;
      default:
        break;
    }
    System.out.println((userGuess == correctAnswer) ? correct : incorrect + correctAnswer);
    return (userGuess == correctAnswer);
  }
}