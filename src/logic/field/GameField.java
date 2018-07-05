package logic.field;

import logic.IGameEntity;

public class GameField {

    public final int FIELD = 100;
    private Tile[][] tiles;

    public GameField() {
        this.tiles = new Tile[10][10];
        this.initialize();
    }

    private void initialize() {
        //x coordinate
        for (int i = 0; i < 10; i++) {
            //y coordinate
            for (int j = 0; j < 10; j++) {
                if (tiles[i][j].empty()) {
                    this.tiles[i][j] = new Tile(i, j);
                }
            }
        }
    }

    /**
     * Gets the tiles in ultimate vicinity packed in an array,
     * from top first clockwise to top left
     *
     * @return array of tiles
     */
    public int[][] getAdjacentTileCoords(IGameEntity entity) {
        //copies the coordinates of this tile to calculate the array
        int x = entity.getCurrentPos().getxCoord();
        int y = entity.getCurrentPos().getyCoord();
        return new int[][]{{y+1,x}, {y+1,x+1}, {y,x+1}, {y-1,x+1}, {y-1,x}, {y-1,x-1}, {y,x-1}, {y+1,x-1}};
    }
}
