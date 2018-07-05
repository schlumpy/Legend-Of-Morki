package logic.defenders.soldiers;

import logic.AGameEntity;

public class Crusader extends AGameEntity {

    /**
     * Creates a new instance of a Crusader
     */
    public Crusader() {
        this.setHp(70);
        this.setDmg(25);
        this.setAttackspeed(0.3);
        this.setAlive(true);
        this.setAoe(false);
    }

    /**
     * Has a 30% chance to be revived on spot with 50% max. HP and 200% damage
     */
    @Override
    public void die() {
        int random = (int) (Math.random() * 10);
        if (random == 4 || random == 2 || random == 0) {
            //blaze it
            this.setHp(35);
            this.setDmg(this.getDmg() * 2);
        } else {
            this.setAlive(false);
        }
    }
}
