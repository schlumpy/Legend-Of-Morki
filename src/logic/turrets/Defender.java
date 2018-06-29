package logic.turrets;

public abstract class Defender {

    int hp;
    int dmg;
    double attackspeed;
    boolean alive;
    boolean aoe;

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

    /**
     * Sets the new HP of a defender
     * @param hp new hp
     */
    public void setHp(int hp) {
        this.hp = hp;
    }
}
