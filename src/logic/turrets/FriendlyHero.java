package logic.turrets;

import logic.Heroes;
import logic.Skill;

public abstract class FriendlyHero implements Heroes{
    int damage;
    int hp;
    Skill mainSkill;
    Skill secondSkill;
    int attackSpeed;
    int armor;
    boolean alive;
    int speed;
    int level;

    public int getLevel(){
        return this.level;
    }

    public void setLevel(int Level){
        this.level = level;
    }

    public abstract void levelUp();

}
