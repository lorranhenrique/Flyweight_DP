package org.example.structural.Flyweight;

public class Car
{
    private Engine engine;
    private String name;

    public Car(Engine engine, String name)
    {
        this.engine = engine;
        this.name = name;
    }

    public String getCar()
    {
        return "Car "+this.name+ " with a "+this.engine.getName()+" Engine and "+this.engine.getPocotos()+" of horsepower";
    }

}
