package logic.attackers;

import logic.AGameEntity;
import logic.IGameEntity;
import logic.defenders.ATurret;
import logic.field.GameField;

public class EvilMage extends AGameEntity {

    public EvilMage() {
        this.setHp(65);
        this.setDmg(100);
        this.setSpeed(4);
        this.setAttackspeed(0.1);
        this.setAlive(true);
    }

    /**
     * When the evil mage dies, he deals half of its damage to all surrounding defenders.
     * TODO change dependencies
     */
    public void die(GameField field) {
        this.setAlive(false);
        //explodes when he dies
        for (int i = 0; i < field.getAdjacentTileCoords(this).length; i++) {
            //y+1, x, y+1, x+1, y, x+1, y-1, x+1, y-1, x, y-1, x-1, y, x-1, y+1, x-1
            if (field.getAdjacentTileCoords(this)[i] % 2 == 0) {
                IGameEntity[] cur = field.getTileFromCoords(i, i + 1).getCurrentOnTile();
                //deals half of its damage, currently hardcoded
                for (IGameEntity current : cur) {
                    //only deals damage to turrets so far
                    if (current instanceof ATurret) {
                        current.setHp(current.getHp() - 50);
                    }
                }
            }
        }
    }
}
