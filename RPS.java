public class RPS {

  /** choiceText - returns the text value that corresponds to the received choice.
  @param (int) choice - The user's choice
  @return (String) - Text value aligned with choice (1. Paper, 2. Rock, 3. Scissors)
  */
  public static String choiceText(int choice) {
    if (choice == 1) {
      return "Paper";
    } else if (choice == 2) {
      return "Rock";
    } else if (choice == 3) {
      return "Scissors";
    } else {
      return "Invalid choice";
    }
  }

  /** gameResults - returns the text of the game results, based on the player and computer’s choices
  @param (int) playerChoice - The player's choice
  @param (int) computerChoice - The computer's choice
  @return (String) - Game results based on player and computer choices
  */
  public static String gameResults(int playerChoice, int computerChoice) {
    if (playerChoice == computerChoice) {
      return "Tie game.";
    }

    // Paper (1), Rock (2), Scissors (3)
    if (playerChoice == 1 && computerChoice == 2) {
      return "Paper covers rock.\nYou win.";
    } else if (playerChoice == 1 && computerChoice == 3) {
      return "Scissors cut paper.\nYou lose.";
    } else if (playerChoice == 2 && computerChoice == 1) {
      return "Paper covers rock.\nYou lose.";
    } else if (playerChoice == 2 && computerChoice == 3) {
      return "Rock crushes scissors.\nYou win.";
    } else if (playerChoice == 3 && computerChoice == 1) {
      return "Scissors cut paper.\nYou win.";
    } else if (playerChoice == 3 && computerChoice == 2) {
      return "Rock crushes scissors.\nYou lose.";
    } else {
      return "Invalid input.";
    }
  }
}