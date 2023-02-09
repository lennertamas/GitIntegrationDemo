package com.company;

import java.util.ArrayList;

public class Zoo {

    ArrayList<Animal> animals = new ArrayList<>();

    public void showAnimals()
    {
        for (Animal animal : animals)
        {
            System.out.println(animal.getName());

            try
            {
                Zebra z = (Zebra) animal;
                System.out.println(z.Age);
            }
            catch (Exception e)
            {
                System.out.println("this is not zebra");
            }
        }
    }
}
