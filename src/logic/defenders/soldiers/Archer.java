package logic.defenders.soldiers;

import logic.defenders.ADefender;

public class Archer extends ADefender {

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
    @Override
    public void die() {
        this.setAlive(false);
        //Does nothing when it dies
    }
}
