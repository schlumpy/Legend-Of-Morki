package logic;

import logic.enemies.Enemy;
import logic.turrets.Defender;
import logic.turrets.Turret;

public class DefendHandler {

    /**
     * Handles the fight between a defending turret and an attacking monster
     * @param defender Turret
     * @param attacker Monster
     */
    public void handleDefence(Turret defender, Enemy attacker) {
        Defender[] defence = defender.getCurrentDefenders();
        while (!defender.empty()) {
            attacker.setHp(attacker.getHp() - defender.getTotalDefenderDamage());
            if (attacker.isAoe()) {
                for (Defender curDefence : defence) {
                    if (curDefence != null) {
                        curDefence.setHp(curDefence.getHp() - attacker.getDmg());
                    }
                }
            } else {
                for (int i = defence.length; i > 0; i--) {
                    if (defence[i] != null) {
                        defence[i].setHp(defence[i].getHp() -attacker.getDmg());
                        break;
                    }
                }
            }
        }
    }
}
