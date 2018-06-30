package logic.field;

import logic.IGameEntity;

public class GameField extends Tiles {

    //experimental
    //replace with interface later

    /**
     * Gets the tiles in ultimate vicinity packed in an array,
     * from top first clockwise to top right
     * @return array of tiles
     */
    public Tiles[] getAdjacentTiles(IGameEntity entity) {
        //just so i dont get annoyed by the warning ;)
        return getAdjacentTiles(entity);
    }
}
