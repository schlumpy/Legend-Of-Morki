package logic;

import logic.enemies.Enemy;
import logic.turrets.Turret;

public class DefendHandler {

    /**
     * Handles the fight between a defending turret and an attacking monster
     * @param defender Turret
     * @param attacker Monster
     */
    DefendHandler(Turret defender, Enemy attacker) {
        while(defender.isAlive() || attacker.isAlive()) {
            //without armor
            defender.setHp(defender.getHp() - attacker.getDmg());
            attacker.setHp(attacker.getHp() - defender.getDmg());
        }
    }
}
