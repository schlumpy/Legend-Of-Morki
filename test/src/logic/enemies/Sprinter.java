package logic.enemies;

public class Sprinter extends Enemy{

    /**
     * Creates an instance of Sprinter
     */
    Sprinter() {
        this.hp    = 35;
        this.dmg   = 15;
        this.speed = 50;
        this.alive = true;
    }
}
