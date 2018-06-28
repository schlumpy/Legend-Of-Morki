package logic.turrets;

public abstract class Turret {

    int hp;
    int dmg;
    int attackspeed;
    boolean alive;

    /**
     * Sets hp of a turret after a fight
     * @param hp amount
     */
    public void setHp(int hp) {
        this.hp = hp;
    }

    /**
     * Gets the current amount of hp
     * @return current hp
     */
    public int getHp() {
        return this.hp;
    }

    /**
     * Sets the current damage a turret deals
     * @param dmg new damage
     */
    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    /**
     * Sets the new damage of a turret, e.g. after a buff
     * @return current damage
     */
    public int getDmg() {
        return this.dmg;
    }

    /*
    Getters/Setters Missing
     */

    /**
     * Gets the State of a turret
     * @return alive?
     */
    public boolean isAlive() {
        return alive;
    }
}
