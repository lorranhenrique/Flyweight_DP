package org.example.structural.Flyweight;

public class Engine
{
    private String name;
    private int horsePower;

    public Engine(String name, int horsePower)
    {
        this.name = name;
        this.horsePower = horsePower;
    }

    public String getName()
    {
        return this.name;
    }

    public int getPocotos()
    {
        return this.horsePower;
    }
}
