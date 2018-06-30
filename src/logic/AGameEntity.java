package logic;

public abstract class AGameEntity implements IGameEntity {

    private int hp;
    private int dmg;
    private int speed;
    private double attackspeed;
    private boolean alive;
    private boolean aoe;

    /**
     * Lets the entity die
     */
    public void die() {
        this.alive = false;
    }

    /**
     * @inheritDoc
     */
    public int getHp() {
        return hp;
    }

    /**
     * @inheritDoc
     */
    public void setHp(int hp) {
        this.hp = hp;
    }

    /**
     * @inheritDoc
     */
    public int getDmg() {
        return dmg;
    }

    /**
     * @inheritDoc
     */
    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    /**
     * @inheritDoc
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * @inheritDoc
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * @inheritDoc
     */
    public double getAttackspeed() {
        return attackspeed;
    }

    /**
     * @inheritDoc
     */
    public void setAttackspeed(double attackspeed) {
        this.attackspeed = attackspeed;
    }

    /**
     * @inheritDoc
     */
    public boolean isAlive() {
        return alive;
    }

    /**
     * @inheritDoc
     */
    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    /**
     * @inheritDoc
     */
    public boolean isAoe() {
        return this.aoe;
    }

    /**
     * @inheritDoc
     */
    public void setAoe(boolean aoe) {
        this.aoe = aoe;
    }

}
