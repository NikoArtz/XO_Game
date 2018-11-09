package XO.Game.controllers;

import XO.Game.model.Field;
import XO.Game.model.Figure;
import XO.Game.model.exceptions.AlreadyOccupiedException;
import XO.Game.model.exceptions.InvalidePointException;

import java.awt.*;

public class MoveController {
    public void applyFigure(final Field field,
                            final Point point,
                            final Figure figure) throws AlreadyOccupiedException, InvalidePointException {
        if (field.getFigure(point)!= null) {
            throw new AlreadyOccupiedException();
        }
         field.setFigure(point, figure);
    }
}
