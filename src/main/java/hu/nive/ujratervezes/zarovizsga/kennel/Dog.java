package hu.nive.ujratervezes.zarovizsga.kennel;

public class Dog
{
    protected String name;
    protected int happiness;


    public Dog(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public int getHappiness() {
        return happiness;
    }

    public void feed()
    {
    }

    public void play(int hours)
    {
    }
}
