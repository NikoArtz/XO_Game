package XO.Game.controllers;

import XO.Game.model.Field;
import XO.Game.model.Figure;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class WinnerControllerTest {

    @Test
    public void testGetWinnerWhenWinnerInRow() throws Exception {

        final WinnerController winnerController = new WinnerController();
        for(int i = 0; i < 3;i++) {
            final Field field = new Field(3);
            field.setFigure(new Point(i, 0), Figure.X);
            field.setFigure(new Point(i, 1), Figure.X);
            field.setFigure(new Point(i, 2), Figure.X);
            assertEquals(Figure.X, winnerController.getWinner(field));
        }


    }

    @Test
    public void testGetWinnerWhenNoWinnerInColumn() throws Exception {

        final WinnerController winnerController = new WinnerController();
        for(int i = 0; i < 3;i++) {
            final Field field = new Field(3);
            field.setFigure(new Point(0, i), Figure.X);
            field.setFigure(new Point(1, i), Figure.X);
            field.setFigure(new Point(2, i), Figure.O);
            assertNull(null, winnerController.getWinner(field));
        }


    }
    @Test
    public void testGetWinnerWhenWinnerInDiagonal1() throws Exception {

        final WinnerController winnerController = new WinnerController();

            final Field field = new Field(3);
            field.setFigure(new Point(0, 0), Figure.X);
            field.setFigure(new Point(1, 1), Figure.X);
            field.setFigure(new Point(2, 2), Figure.X);
            assertEquals(Figure.X, winnerController.getWinner(field));



    }
    @Test
    public void testGetWinnerWhenNoWinnerInDiagonal1() throws Exception {

        final WinnerController winnerController = new WinnerController();

        final Field field = new Field(3);
        field.setFigure(new Point(0, 0), Figure.X);
        field.setFigure(new Point(1, 1), Figure.X);
        field.setFigure(new Point(2, 2), Figure.O);
        assertNull(null, winnerController.getWinner(field));



    }
    @Test
    public void testGetWinnerWhenWinnerInDiagonal2() throws Exception {

        final WinnerController winnerController = new WinnerController();

        final Field field = new Field(3);
        field.setFigure(new Point(0, 2), Figure.X);
        field.setFigure(new Point(1, 1), Figure.X);
        field.setFigure(new Point(2, 0), Figure.X);
        assertEquals(Figure.X, winnerController.getWinner(field));
    }
    @Test
    public void testGetWinnerWhenNoWinnerInDiagonal2() throws Exception {

        final WinnerController winnerController = new WinnerController();

        final Field field = new Field(3);
        field.setFigure(new Point(0, 2), Figure.X);
        field.setFigure(new Point(1, 1), Figure.X);
        field.setFigure(new Point(2, 0), Figure.O);
        assertNull(null, winnerController.getWinner(field));
    }
}