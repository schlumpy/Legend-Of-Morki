package logic.attackers;

import logic.AGameEntity;

public class Sprinter extends AGameEntity {

    /**
     * Creates an instance of Sprinter
     */
    public Sprinter() {
        this.setHp(10);
        this.setDmg(30);
        this.setAttackspeed(0.7);
        this.setAlive(true);
    }
}
