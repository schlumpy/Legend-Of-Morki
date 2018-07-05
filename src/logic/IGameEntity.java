package logic;

import logic.field.Tile;

public interface IGameEntity {

    /**
     * Gets the current amount of hp
     * @return current hp
     */
    int getHp();

    /**
     * Sets the new hp of an entity
     * @param hp new hp
     */
    void setHp(int hp);

    /**
     * Gets the current damage an entity is capable of
     * @return current damage
     */
    int getDmg();

    /**
     * Sets the damage of an entity, e.g. after a buff
     * @param dmg new dmg
     */
    void setDmg(int dmg);

    /**
     * Gets the current speed of an entity
     * @return current speed
     */
    int getSpeed();

    /**
     * Sets the new speed of an entity
     * @param speed new speed
     */
    void setSpeed(int speed);

    /**
     * Gets the Attackspeed of a certain kind of entity
     * @return attackspeed
     */
    double getAttackspeed();

    /**
     * Sets Attackspeed, e.g. after a buff
     * @param attackspeed new speed
     */
    void setAttackspeed(double attackspeed);

    /**
     * Gets the State of an entity
     * @return alive?
     */
    boolean isAlive();

    /**
     * Sets current status
     * @param alive current status
     */
    void setAlive(boolean alive);

    /**
     * Does the attacker deal aoe damage?
     * @return aoe?
     */
    boolean isAoe();

    /**
     * Sets if the attacker deals area of effect damage.
     * @param aoe ?
     */
    void setAoe(boolean aoe);

    /**
     * Gets the current tile of this entity
     * @return current tile
     */
    Tile getCurrentPos();
}
