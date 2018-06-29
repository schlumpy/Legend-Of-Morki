package logic.attackers.enemies;

import logic.attackers.AEnemy;

public class Sprinter extends AEnemy {

    /**
     * Creates an instance of Sprinter
     */
    Sprinter() {
        this.setHp(10);
        this.setDmg(30);
        this.setAttackspeed(0.7);
        this.setAlive(true);
    }
}
