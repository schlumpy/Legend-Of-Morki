package logic.attackers;

public interface IEnemy {

    /**
     * Gets the current amount of hp
     * @return current hp
     */
    public int getHp();

    /**
     * Sets the new hp of an enemy
     * @param hp new hp
     */
    public void setHp(int hp);

    /**
     * Gets the current damage an enemy is capable of
     * @return current damage
     */
    public int getDmg();

    /**
     * Sets the damage of an AEnemy, e.g. after a buff
     * @param dmg new dmg
     */
    public void setDmg(int dmg);

    /**
     * Gets the current speed of an enemy
     * @return current speed
     */
    public int getSpeed();

    /**
     * Sets the new speed of an enemy
     * @param speed new speed
     */
    public void setSpeed(int speed);

    /**
     * Gets the Attackspeed of a certain kind of monster
     * @return attackspeed
     */
    public double getAttackspeed();

    /**
     * Sets Attackspeed, e.g. after a buff
     * @param attackspeed new speed
     */
    public void setAttackspeed(double attackspeed);

    /**
     * Gets the State of an enemy.
     * @return alive?
     */
    public boolean isAlive();

    /**
     * Sets current status
     * @param alive current status
     */
    public void setAlive(boolean alive);

    /**
     * Does the attacker deal aoe damage?
     * @return aoe?
     */
    public boolean isAoe();

    /**
     * Sets if the attacker deals area of effect damage.
     * @param aoe ?
     */
    public void setAoe(boolean aoe);
}
