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
        //while there is at least one defender on the turret, it will result in a fight
        while (!defender.empty()) {
            //defenders do damage to the attacker
            attacker.setHp(attacker.getHp() - defender.getTotalDefenderDamage());
            //does the attacker deal area of effect damage?
            if (attacker.isAoe()) {
                //deal damage to all defenders
                for (Defender curDefence : defence) {
                    if (curDefence != null) {
                        curDefence.setHp(curDefence.getHp() - attacker.getDmg());
                        //if hp surpasses zero, die
                        if (curDefence.getHp() <= 0) {
                            curDefence.die();
                        }
                    }
                }
            } else {
                //if not, deal damage to the only nearest defender
                for (int i = defence.length; i > 0; i--) {
                    if (defence[i] != null) {
                        defence[i].setHp(defence[i].getHp() - attacker.getDmg());
                        //if hp surpasses zero, die
                        if (defence[i].getHp() <= 0) {
                            defence[i].die();
                        }
                        break;
                    }
                }
            }
        }
    }
}
