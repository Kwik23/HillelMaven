package hw21;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RockPaperScissorsGameTest {
    private RockPaperScissorsGame game;

    @BeforeEach
    public void setup() {
        game = new RockPaperScissorsGame();
    }

    @Test
    public void testDetermineWinner() {
        // Player: ROCK, Computer: SCISSORS -> WIN
        Result result1 = game.determineWinner(Choice.ROCK, Choice.SCISSORS);
        Assertions.assertEquals(Result.WIN, result1);

        // Player: PAPER, Computer: PAPER -> DRAW
        Result result2 = game.determineWinner(Choice.PAPER, Choice.PAPER);
        Assertions.assertEquals(Result.DRAW, result2);

        // Player: SCISSORS, Computer: ROCK -> LOSS
        Result result3 = game.determineWinner(Choice.SCISSORS, Choice.ROCK);
        Assertions.assertEquals(Result.LOSS, result3);
    }

    @Test
    public void testGetChoiceByNumber() {
        Choice choice1 = game.getChoiceByNumber(1);
        Assertions.assertEquals(Choice.ROCK, choice1);

        Choice choice2 = game.getChoiceByNumber(2);
        Assertions.assertEquals(Choice.SCISSORS, choice2);

        Choice choice3 = game.getChoiceByNumber(3);
        Assertions.assertEquals(Choice.PAPER, choice3);
    }
}

