package logic.field;

import logic.IGameEntity;

public class Tile {

    private IGameEntity[] currentOnTile;
    private int xCoord;
    private int yCoord;

    Tile(int x, int y) {
        currentOnTile = null;
        this.xCoord = x;
        this.yCoord = y;
    }

    /**
     * Determines if this tile is empty or not
     * @return empty?
     */
    public boolean empty() {
        return currentOnTile == null;
    }

    /**
     * Adds the new entity on te first not null cell
     * @param newEntity new
     */
    public void enterField(IGameEntity newEntity) {
        for (int i  = currentOnTile.length; i > 0; i--) {
            if (currentOnTile[i] == null) {
                currentOnTile[i] = newEntity;
            }
        }
    }


    /**
     * Gets all present entities on this tile
     * @return entities
     */
    public IGameEntity[] getCurrentOnTile() {
        return this.currentOnTile;
    }

    public int getxCoord() {
        return this.xCoord;
    }

    public int getyCoord() {
        return this.yCoord;
    }
}
