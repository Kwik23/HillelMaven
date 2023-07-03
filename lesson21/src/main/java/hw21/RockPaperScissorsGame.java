package hw21;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {
    private int totalGames;
    private int wins;
    private int losses;
    private boolean gameOver;
    private Scanner scanner;
    private Random random;

    public RockPaperScissorsGame() {
        scanner = new Scanner(System.in);
        random = new Random();
    }

    public void startGame() {
        System.out.println("Welcome to the Rock-Paper-Scissors Game!");
        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();

        System.out.print("Enter the number of games: ");
        int numGames = scanner.nextInt();
        scanner.nextLine(); // Clear the buffer

        totalGames = 0;
        wins = 0;
        losses = 0;
        gameOver = false;

        while (totalGames < numGames && !gameOver) {
            System.out.println("Your choice: ");
            System.out.println("1 - Rock");
            System.out.println("2 - Scissors");
            System.out.println("3 - Paper");
            System.out.println("0 - Quit the game");
            System.out.print("Enter the choice number: ");
            int userChoice = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            switch (userChoice) {
                case 0:
                    gameOver = true;
                    break;
                case 1:
                case 2:
                case 3:
                    Choice playerChoice = getChoiceByNumber(userChoice);
                    Choice computerChoice = getRandomChoice();

                    System.out.println("You chose: " + playerChoice);
                    System.out.println("Computer chose: " + computerChoice);

                    Result result = determineWinner(playerChoice, computerChoice);
                    System.out.println(result);

                    totalGames++;
                    if (result == Result.WIN) {
                        wins++;
                    } else if (result == Result.LOSS) {
                        losses++;
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        System.out.println("Game over!");
        System.out.println("Total games played: " + totalGames);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

    public Choice getChoiceByNumber(int choiceNumber) {
        return Choice.values()[choiceNumber - 1];
    }

    public Choice getRandomChoice() {
        int randomIndex = random.nextInt(Choice.values().length);
        return Choice.values()[randomIndex];
    }

    public Result determineWinner(Choice playerChoice, Choice computerChoice) {
        if (playerChoice == computerChoice) {
            return Result.DRAW;
        } else if ((playerChoice == Choice.ROCK && computerChoice == Choice.SCISSORS) ||
                (playerChoice == Choice.SCISSORS && computerChoice == Choice.PAPER) ||
                (playerChoice == Choice.PAPER && computerChoice == Choice.ROCK)) {
            return Result.WIN;
        } else {
            return Result.LOSS;
        }
    }
}


