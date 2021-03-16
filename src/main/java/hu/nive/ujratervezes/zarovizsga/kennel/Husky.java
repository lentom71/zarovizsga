package hu.nive.ujratervezes.zarovizsga.kennel;

import hu.nive.ujratervezes.zarovizsga.kennel.Dog;

public class Husky extends Dog
{
    public Husky(String name)
    {
        super(name);
    }

    @Override
    public void feed()
    {
        happiness = happiness +4;
    }

    @Override
    public void play(int hours)
    {
        happiness = happiness + (hours * 3);
    }
}
