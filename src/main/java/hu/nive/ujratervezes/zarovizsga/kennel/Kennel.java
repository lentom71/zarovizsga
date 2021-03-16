package hu.nive.ujratervezes.zarovizsga.kennel;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class Kennel
{
    List<Dog>  kutyaLista = new ArrayList<>();

    public void addDog(Dog dog)
    {
        kutyaLista.add(dog);
    }

    public void feedAll()
    {
        for(Dog kutya: kutyaLista)
        {
            kutya.feed();
        }
    }

    public Dog findByName(String name)
    {
        for(Dog kutya: kutyaLista)
        {
            if(kutya.getName().equals(name))
            {
                return kutya;
            }
        }
        return  null;
    }

    public void playWith(String name, int hours)
    {
        for(Dog kutya: kutyaLista)
        {
            if (kutya.getName().equals(name))
            {
                kutya.play(hours);
            }
        }
    }

    public List<String> getHappyDogNames(int minHappiness)
    {
        List<String> happyDogs = new ArrayList<>();

        for(Dog kutya: kutyaLista)
        {
            if (kutya.getHappiness() > minHappiness)
            {
                happyDogs.add(kutya.name);
            }
        }
        return happyDogs;
    }

    public List<Dog> getDogs()
    {
        return kutyaLista;
    }
}
