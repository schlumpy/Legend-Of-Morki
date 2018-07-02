package logic.field;

import logic.AGameEntity;
import logic.IGameEntity;

public class Tile {

    private IGameEntity[] currentOnField;
    private int xCoord;
    private int yCoord;

    Tile(int x, int y) {
        currentOnField = null;
        this.xCoord = x;
        this.yCoord = y;
    }

    /**
     * Determines if this tile is empty or not
     * @return empty?
     */
    public boolean empty() {
        return currentOnField == null;
    }

    /**
     * Adds the new entity on te first not null cell
     * @param newEntity new
     */
    public void enterField(IGameEntity newEntity) {
        for (int i  = currentOnField.length; i > 0; i--) {
            if (currentOnField[i] == null) {
                currentOnField[i] = newEntity;
            }
        }
    }

    public Tile getTileFromCoords(int x, int y) {

    }

    public void leaveField() {
        //TODO
    }

    public IGameEntity[] getCurrentOnField() {
        return currentOnField;
    }

    public int getxCoord() {
        return this.xCoord;
    }

    public int getyCoord() {
        return this.yCoord;
    }
}
