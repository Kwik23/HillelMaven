package hw21;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RockPaperScissorsGameTest {
    @Test
    public void testDetermineWinner() {
        RockPaperScissorsGame game = new RockPaperScissorsGame();

        Result result1 = game.determineWinner(Choice.ROCK, Choice.SCISSORS);
        Assertions.assertEquals(Result.WIN, result1);

        Result result2 = game.determineWinner(Choice.PAPER, Choice.PAPER);
        Assertions.assertEquals(Result.DRAW, result2);

        Result result3 = game.determineWinner(Choice.SCISSORS, Choice.ROCK);
        Assertions.assertEquals(Result.LOSS, result3);
    }
}


