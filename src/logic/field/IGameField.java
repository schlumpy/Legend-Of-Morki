package logic.field;

import logic.IGameEntity;

public interface IGameField {

    /**
     * Initializes the gamefield with all it needs
     */
    void initialize();

    /**
     * Gets the tile back from coordinates.
     * @param x x-Coord
     * @param y y-Coord
     * @return Tile
     */
    Tile getTileFromCoords(int x, int y);

    /**
     * Gets the tiles in ultimate vicinity packed in an array,
     * from top first clockwise to top left
     *
     * @return array of tiles
     */
    Tile[] getAdjacentTiles(IGameEntity entity);
}
