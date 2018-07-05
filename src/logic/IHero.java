package logic;

/**
 * Created by schlumpy on 02.07.2018.
 */
public interface IHero extends IGameEntity{
    ISkill getMainSkill();

    ISkill getSecondSkill();

    ISkill getThirdSkill();

    void setMainSkill(ISkill skill);

    void setSecondSkill(ISkill skill);

    void setThirdSkill(ISkill skill);

    int getLevel();

    void setLevel(int level);

    IHero getHero();

    void setArmor(int armor);

    void setAP(int ap);

    int getArmor();

    int getAP();
}
