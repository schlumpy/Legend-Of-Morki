package logic.enemies;

import logic.Heroes;
import logic.Skill;

public abstract class EnemyHero implements Heroes {
    int damage;
    int hp;
    Skill mainSkill;
    Skill secondSkill;
    int attackSpeed;
    int armor;
    boolean alive;
    int speed;
    int difficulty;
}
