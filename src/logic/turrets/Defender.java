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
}
