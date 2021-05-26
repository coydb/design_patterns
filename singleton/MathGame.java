import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class MathGame {
  private static MathGame mathGame;
  private int score;
  private Random rand;
  private Scanner reader;
  private String[] operands = {"+", "-", "*", "/"};

  private MathGame(){
    rand = new Random();
    reader = new Scanner(System.in);
  }

  public static MathGame getInstance() {
    if(mathGame == null) {
      mathGame = new MathGame();
    }
    return mathGame;
  }

  public void play() {
    boolean playAgain = true;
    String userInput = "";

    System.out.println("Let's have fun with math!");
    while (playAgain) {
      System.out.println("(P)lay or (Q)uit:");
      userInput = reader.nextLine().toLowerCase();
      switch(userInput) {
        case "p":
          if(playRound()) {
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
    System.out.println("You won " + score + " games!");
    System.out.println("Goodbye.");
  }

  private boolean playRound() {
    int leftNumber = rand.nextInt(100)+1;
    int rightNumber = rand.nextInt(100)+1;
    String operand = operands[rand.nextInt(4)];

    System.out.println("Round answer to 1 decimal place.");
    System.out.print(leftNumber + operand + rightNumber + "=");
    double userGuess = reader.nextDouble();
    reader.nextLine();
    return checkGuess(leftNumber, rightNumber, operand, userGuess);
  }

  private boolean checkGuess(int leftNumber, int rightNumber, String operator, double userGuess) {
    double correctAnswer =0.0;
    switch(operator) {
      case "+":
        correctAnswer = leftNumber+rightNumber;
        break;
      case "-":
        correctAnswer = leftNumber-rightNumber;
        break;
      case "*":
        correctAnswer = leftNumber*rightNumber;
        break;
      case "/":
        correctAnswer = ((double)leftNumber/(double)rightNumber);
        var rounder = new DecimalFormat("#.#");
        correctAnswer = Double.valueOf(rounder.format(correctAnswer));
        break;
      default:
        break;
    }
    System.out.println((userGuess == correctAnswer) ? "Correct!" : "Incorrect. Correct answer is: "+correctAnswer);
    return (userGuess == correctAnswer);
  }
}