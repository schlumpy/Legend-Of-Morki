package logic.attackers;

import logic.AGameEntity;
import logic.field.GameField;

public class EvilMage extends AGameEntity {

    //experimental
    public GameField field;

    public EvilMage(GameField gameField) {
        //use gamefield to determine where the mage will spawn
        this.field = gameField;
        this.setHp(65);
        this.setDmg(100);
        this.setSpeed(4);
        this.setAttackspeed(0.1);
        this.setAlive(true);
    }

    @Override
    public void die() {
        this.setAlive(false);
        //explodes when he dies
        this.field.getAdjacentTiles(this);

    }
}
