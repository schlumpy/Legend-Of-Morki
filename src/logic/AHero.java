package logic;

import logic.field.Tile;

/**
 * Created by schlumpy on 05.07.2018.
 */
public abstract class AHero implements IHero {
    private ISkill mainSkill;
    private ISkill secondSkill;
    private ISkill thirdSkill;
    private int hp;
    private int dmg;
    private int speed;
    private double attackspeed;
    private boolean alive;
    private boolean aoe;
    private Tile position;
    private int ap;
    private int armor;


    @Override
    public ISkill getMainSkill() {
        return null;
    }

    @Override
    public ISkill getSecondSkill() {
        return null;
    }

    @Override
    public ISkill getThirdSkill() {
        return null;
    }

    @Override
    public void setMainSkill(ISkill skill) {

    }

    @Override
    public void setSecondSkill(ISkill skill) {

    }

    @Override
    public void setThirdSkill(ISkill skill) {

    }

    @Override
    public int getLevel() {
        return 0;
    }

    @Override
    public void setLevel(int level) {

    }

    @Override
    public IHero getHero() {
        return null;
    }

    @Override
    public void setArmor(int armor) {

    }

    @Override
    public void setAP(int ap) {

    }

    @Override
    public int getArmor() {
        return 0;
    }

    @Override
    public int getAP() {
        return 0;
    }

    @Override
    public int getHp() {
        return 0;
    }

    @Override
    public void setHp(int hp) {

    }

    @Override
    public int getDmg() {
        return 0;
    }

    @Override
    public void setDmg(int dmg) {

    }

    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public void setSpeed(int speed) {

    }

    @Override
    public double getAttackspeed() {
        return 0;
    }

    @Override
    public void setAttackspeed(double attackspeed) {

    }

    @Override
    public boolean isAlive() {
        return false;
    }

    @Override
    public void setAlive(boolean alive) {

    }

    @Override
    public boolean isAoe() {
        return false;
    }

    @Override
    public void setAoe(boolean aoe) {

    }

    @Override
    public Tile getCurrentPos() {
        return null;
    }

}
