package logic.turrets;

abstract class Defender {

    int hp;
    int dmg;
    double attackspeed;
    boolean alive;

    /**
     * Minus one defender.
     */
    public abstract void die();

    /**
     * Gets the current hp of a defender.
     * @return current hitpoints
     */
    public int getHp() {
        return this.hp;
    }

    /**
     * Gets the current attack of this defender for a fight.
     * @return current damage
     */
    public int getDmg() {
        return this.dmg;
    }


}
