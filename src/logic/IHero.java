package logic;

/**
 * Created by schlumpy on 02.07.2018.
 */
public interface IHero extends IGameEntity{
    Skills getMainSkill();

    Skills getSecondSkill();

    Skills getThirdSkill();

    public void setMainSkill();

    public void setSecondSkill();

    public void setThirdSkill();

    public int getLevel();

    public void setLevel();

    public  IHero getHero();
}
