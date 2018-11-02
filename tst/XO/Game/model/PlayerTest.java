package XO.Game.model;

import org.junit.Test;

import static org.testng.Assert.assertEquals;

public class PlayerTest {

    @Test
    public void getName() throws Exception {
        final String inputValue = "Nikita";
        final String expectedValue = inputValue;
        final Player player = new Player(inputValue, null);
        final String actualValue = player.getName();
        assertEquals(expectedValue,actualValue);
    }



    @Test
    public void getFigure() throws Exception{
        final Figure inputValue1 = Figure.X;
        final Figure expectedValue1 = inputValue1;
        final Player player = new Player(null, expectedValue1);
        final Figure actualValue = player.getFigure();
        assertEquals(expectedValue1,actualValue);
    }
}