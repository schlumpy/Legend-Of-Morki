package logic.defenders.soldiers;

import logic.AGameEntity;
import logic.defenders.ATurret;

public class Catapult extends AGameEntity {

    /**
     * Creates a ne instance of a catapult
     */
    public Catapult(ATurret turret) {
        this.setHp(144);
        this.setDmg(20);
        if (!turret.empty()) {
            this.setAttackspeed(0.2);
        } else {
            this.setAttackspeed(0.05);
        }
        this.setAlive(true);
        this.setAoe(true);
    }


}
