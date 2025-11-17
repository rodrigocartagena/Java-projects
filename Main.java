import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("---Paper Rock Scissors---");
    System.out.println("");
    System.out.println("---Menu---");
    System.out.println("1. Paper");
    System.out.println("2. Rock");
    System.out.println("3. Scissors");
    System.out.println("");
    System.out.print("Enter selection: ");

    int playerChoice = sc.nextInt();

    // Random choice for the computer (1 to 3)
    int computerChoice = (int) (Math.random() * 3) + 1;

    System.out.println("");
    System.out.println("You picked: " + RPS.choiceText(playerChoice));
    System.out.println("The computer picked: " + RPS.choiceText(computerChoice));
    System.out.println(RPS.gameResults(playerChoice, computerChoice));
  }
}