package logic;

import logic.field.GameField;

/**
 * Created by schlumpy on 02.07.2018.
 */
public interface ISkills {

    public void TacticianSkill(GameField gameField, IHero hero) {
        gameField.getAdjacentTiles(hero.getHero());

    }
    public Skills getTacticianSkill(){
        return
    }
}
