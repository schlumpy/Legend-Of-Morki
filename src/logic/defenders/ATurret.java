package logic.defenders;

/**
 * ATurret is only the base for a defending structure or archer
 * ATurret does not deal damage.
 */
public abstract class ATurret {

    private ADefender[] type;
    private boolean alive;

    ATurret(ADefender[] defence) {
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
     * Returns number of current soldiers, after getting the array of current types of soldiers.
     * @param defence current array of soldiers
     * @return current number of soldiers
     */
    public int getNumberOfDefenders(ADefender[] defence) {
        int re = 0;
        for (ADefender amountDefenders : defence) {
            re += 1;
        }
        return re;
    }

    public ADefender[] getCurrentDefenders() {
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
