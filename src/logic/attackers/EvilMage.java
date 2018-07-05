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
     * Passive Ability: Arcane Overload
     * When the evil mage dies, he deals half of its damage to all surrounding defenders.
     * TODO change dependencies
     */
    public void die(GameField field) {
        this.setAlive(false);
        //explodes when he dies
        for (int i = 0; i < field.getAdjacentTiles(this).length; i++) {
                //deals half of its damage, currently hardcoded
                for (int j = 0; j < field.getAdjacentTiles(this).length; j++) {
                    //Deal damage to all defenders on all tiles in range
                    field.getAdjacentTiles(this)[j].dealDamage(this);
            }
        }
    }
}
