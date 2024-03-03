import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Game {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public void playGame() {
        int guesses = 5;
        while (true) {
            System.out.println("Guess a number between 1 and 100");
            int guessNumber = scanner.nextInt();
            int randomNumber = ThreadLocalRandom.current().nextInt(1, 21);
            if (guessNumber == randomNumber) {
                System.out.println("good guess, you got the answer correct");
                System.out.println("you won the Game");
                break;
            } else {
                System.out.println("good guess but the answer is wrong");
            }
            guesses--;
            if (guesses == 0) {
                System.out.println("Sorry, you've run out of guesses. The correct answer was: " + randomNumber);
                break;
            }
            System.out.println("You have " + guesses + " guesses remaining.");

        }
    }

    }
    

