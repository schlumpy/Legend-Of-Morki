package logic.field;

import logic.IGameEntity;

public class GameField extends Tiles {

    public final int FIELD = 100;
    Tiles[][] tiles;

    public GameField() {
        this.tiles = new Tiles[10][10];
    }

    //experimental
    //replace with interface later

    /**
     * Gets the tiles in ultimate vicinity packed in an array,
     * from top first clockwise to top right
     * @return array of tiles
     */
    public Tiles[] getAdjacentTiles(IGameEntity entity) {
        //TODO
        return null;
    }
}
