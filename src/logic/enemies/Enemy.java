package logic.enemies;

public abstract class Enemy {

    int hp;
    int dmg;
    int speed;
    int attackspeed;
    boolean alive;
    boolean aoe;

    /**
     * Gets the current amount of hp
     * @return current hp
     */
    public int getHp() {
        return hp;
    }

    /**
     * Sets the new hp of an enemy
     * @param hp new hp
     */
    public void setHp(int hp) {
        this.hp = hp;
    }

    /**
     * Gets the current damage an enemy is capable of
     * @return current damage
     */
    public int getDmg() {
        return dmg;
    }

    /**
     * Sets the damage of an Enemy, e.g. after a buff
     * @param dmg new dmg
     */
    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    /*
    Getters/Setters missing
     */

    /**
     * Sets Attackspeed, e.g. after a buff
     * @param attackspeed new speed
     */
    public void setAttackspeed(int attackspeed) {
        this.attackspeed = attackspeed;
    }

    /**
     * Gets the Attackspeed of a certain kind of monster
     * @return attackspeed
     */
    public int getAttackspeed() {
        return attackspeed;
    }

    /**
     * Gets the State of an enemy
     * @return alive?
     */
    public boolean isAlive() {
        return alive;
    }

    /**
     * Does the attacker deal aoe damage?
     * @return aoe?
     */
    public boolean isAoe() {
        return this.aoe;
    }
}
