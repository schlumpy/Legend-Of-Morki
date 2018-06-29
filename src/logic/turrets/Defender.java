package logic.turrets;

public abstract class Defender {

    int hp;
    int dmg;
    double attackspeed;
    boolean alive;
    boolean aoe;

    /**
     * Sets if the defender has already died or not.
     * @param alive ?
     */
    public void setAlive(boolean alive) {
        this.alive = alive;
    }

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
     * Sets the new HP of a defender
     * @param hp new hp
     */
    public void setHp(int hp) {
        this.hp = hp;
    }

    /**
     * Gets the current damage of this defender.
     * @return current damage
     */
    public int getDmg() {
        return this.dmg;
    }

    /**
     * Sets the new damage of this defender.
     * @param dmg new damage
     */
    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    /**
     * Gets the current attackspeed of this defender.
     * @return current attackspeed
     */
    public double getAttackspeed() {
        return attackspeed;
    }

    /**
     * Sets the new attackspeed of this defender.
     * @param attackspeed new attackspeed
     */
    public void setAttackspeed(double attackspeed) {
        this.attackspeed = attackspeed;
    }

    /**
     * Determines if this defender deals aoe damage or not.
     * @return aoe?
     */
    public boolean isAoe() {
        return aoe;
    }

    /**
     * Sets if this defender deals aoe damage or not.
     * @param aoe ?
     */
    public void setAoe(boolean aoe) {
        this.aoe = aoe;
    }
}
