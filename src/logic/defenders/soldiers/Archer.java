package logic.defenders.soldiers;

import logic.AGameEntity;

public class Archer extends AGameEntity {

    Archer() {
        this.setHp(30);
        this.setDmg(14);
        this.setAttackspeed(0.4);
        this.setAlive(true);
        this.setAoe(false);
    }

    /**
     * Minus one defender.
     */
    public void die() {
        this.setAlive(false);
        //Does nothing when it dies
    }
}
