package XO.Game.model;
import XO.Game.model.exceptions.InvalidePointException;
import java.awt.*;

public class Field {

    private  final int MIN_COORDINATE =0 ;

    private final Figure[][] field ;
    private  final int fieldSize;


    public Field(final int fieldSize) {
        this.fieldSize = fieldSize;
        field = new Figure[fieldSize][fieldSize];
    }

    public int getSize(){
        return fieldSize;
    }
    public Figure getFigure(final Point point) throws InvalidePointException {
        if(!checkPoint(point)){
            throw new InvalidePointException();
        }
return field[point.x][point.y];
    }
    public void setFigure(final Point point,final Figure figure) throws InvalidePointException
                                                                        {
        if (!checkPoint(point)) {
            throw new InvalidePointException();
        }

field[point.x][point.y] = figure;
    }
    public boolean checkPoint(final Point point){
return checkCoordinate(point.x,field.length) && checkCoordinate(point.y,field[point.x].length);
    }
    private boolean checkCoordinate(final int coordinate,final int maxCoordinate){
        return coordinate >= MIN_COORDINATE && coordinate < maxCoordinate;
    }
}
