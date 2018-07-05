package logic;

/**
 * Created by schlumpy on 02.07.2018.
 */
public interface IHero extends IGameEntity{
    Skills getMainSkill();

    Skills getSecondSkill();

    Skills getThirdSkill();

    public void setMainSkill(Skills skill);

    public void setSecondSkill(Skills skill);

    public void setThirdSkill(Skills skill);

    public int getLevel();

    public void setLevel();

    public  IHero getHero();
}
