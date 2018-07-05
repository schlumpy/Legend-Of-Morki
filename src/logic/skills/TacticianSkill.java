package logic.skills;

import logic.IHero;
import logic.ISkill;
import logic.field.GameField;
import logic.field.Tile;

/**
 * Created by schlumpy on 05.07.2018.
 */
public class TacticianSkill implements ISkill {
    private GameField gameField;
    private IHero hero;
    private double apUsage;
    private double damageUsage;
    private double armorUsage;

    public TacticianSkill() {
        this.apUsage = 0.12;
        this.damageUsage = 0;
        this.armorUsage = 0.4;
    }

    public void use(GameField gameField, IHero hero) {
        Tile[] vicinity = gameField.getAdjacentTiles(hero.getCurrentPos().getxCoord(), hero.getCurrentPos().getyCoord());
        for (int i = 0; i < vicinity.length; i++) {
            vicinity[i].getCurrentOnTile()[i].setDmg(vicinity[i].getCurrentOnTile()[i].getDmg() + (int) (12 * (apUsage * 100))); //ap Wertigkeit des Heroes
            vicinity[i].getCurrentOnTile()[i].setHp(vicinity[i].getCurrentOnTile()[i].getHp() + (int)(armorUsage * hero.getArmor()));
        }

    }

}
