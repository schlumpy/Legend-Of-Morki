package logic.turrets.defenders;

import logic.turrets.Defender;

public class Archer extends Defender {

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
