package logic.turrets;

public class Archer extends Defender {

    Archer() {
        this.hp    = 30;
        this.dmg   = 14;
        this.attackspeed = 0.4;
        this.alive = true;
    }

    /**
     * Minus one defender.
     */
    @Override
    public void die() {
        this.alive = false;
    }
}
