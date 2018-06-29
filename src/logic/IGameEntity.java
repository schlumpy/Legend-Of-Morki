package logic;

public interface IGameEntity {

    /**
     * Gets the current amount of hp
     * @return current hp
     */
    public int getHp();

    /**
     * Sets the new hp of an entity
     * @param hp new hp
     */
    public void setHp(int hp);

    /**
     * Gets the current damage an entity is capable of
     * @return current damage
     */
    public int getDmg();

    /**
     * Sets the damage of an entity, e.g. after a buff
     * @param dmg new dmg
     */
    public void setDmg(int dmg);

    /**
     * Gets the current speed of an entity
     * @return current speed
     */
    public int getSpeed();

    /**
     * Sets the new speed of an entity
     * @param speed new speed
     */
    public void setSpeed(int speed);

    /**
     * Gets the Attackspeed of a certain kind of entity
     * @return attackspeed
     */
    public double getAttackspeed();

    /**
     * Sets Attackspeed, e.g. after a buff
     * @param attackspeed new speed
     */
    public void setAttackspeed(double attackspeed);

    /**
     * Gets the State of an entity
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
