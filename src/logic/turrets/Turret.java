package logic.turrets;

/**
 * Turret is only the base for a defending structure or archer
 * Turret does not deal damage.
 */
public abstract class Turret {

    private Defender[] type;
    private boolean alive;

    Turret(Defender[] defence) {
        int MAXLENGTH = 4;
        System.arraycopy(defence, 0, this.type, 0, MAXLENGTH);
        this.type = defence;
        this.alive = true;
    }

    /**
     * Gets the State of a turret
     * @return alive?
     */
    public boolean isAlive() {
        return alive;
    }

    /**
     * Returns number of current defenders, after getting the array of current types of defenders.
     * @param defence current array of defenders
     * @return current number of defenders
     */
    public int getNumberOfDefenders(Defender[] defence) {
        int re = 0;
        for (Defender amountDefenders : defence) {
            re += 1;
        }
        return re;
    }

    public Defender[] getCurrentDefenders() {
        return this.type;
    }

    public int getAmountDefenders() {
        return this.type.length;
    }

    public int getTotalDefenderDamage() {
        int re = 0;
        for (int i = 0; i <= this.type.length; i++) {
            re += this.type[i].dmg;
        }
        return re;
    }

    public boolean empty() {
        for (int i = 0; i <= this.type.length; i++) {
            if (!this.type[i].alive) {
                return false;
            }
        }
        return true;
    }
}
