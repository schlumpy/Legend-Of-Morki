package logic.field;

import logic.IGameEntity;

public class GameField implements IGameField {

    private Tile[] path; //TODO
    private Tile[][] tiles;

    public GameField() {
        this.tiles = new Tile[10][10];
        this.initialize();
    }

    public void initialize() {
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

    public Tile getTileFromCoords(int x, int y) {
        for (int i = 0; i < tiles.length; i++) {
            int j = 0;
            if (j == y && i == x) {
                return tiles[i][j];
            }
        }
        return null;
    }

    /**
     * Gets the tiles in ultimate vicinity packed in an array,
     * from top first clockwise to top left
     *
     * @return array of tiles
     */
    public Tile[] getAdjacentTiles(IGameEntity entity) {
        //copies the coordinates of this tile to calculate the array
        int x = entity.getCurrentPos().getxCoord();
        int y = entity.getCurrentPos().getyCoord();
        int[] copy = new int[] { y+1, x, y+1, x+1, y, x+1, y-1, x+1, y-1, x, y-1, x-1, y, x-1, y+1, x-1};
        Tile[] re = new Tile[9];

        for (int i = 0; i < copy.length; i++) {
            //After each y-coord comes a x coord
            if (copy[i] % 2 == 0) {
                for (int j = 0; j < copy.length; j++) {
                    re[j] = entity.getField().getTileFromCoords(i, i + 1);
                }
            }
        }
        return re;
    }
}
