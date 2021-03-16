package hu.nive.ujratervezes.zarovizsga.kennel;

public class Beagle extends Dog
{
    public Beagle(String name)
    {
        super(name);
    }

    @Override
    public void feed()
    {
        happiness = happiness +2;
    }

    @Override
    public void play(int hours)
    {
        happiness = happiness + (hours * 2);
    }
}
