package logic.defenders.Hero;

import logic.AHero;
import logic.Skills;

/**
 * Created by schlumpy on 02.07.2018.
 */
public class Morki extends AHero {

    public Morki(){
        this.setHp(50);
        this.setDmg(20);
        this.setAttackspeed(0.35);
        this.setAlive(true);
        this.setAoe(false);
        this.setMainSkill(Skills.getTacticianSkill);
    }

}
