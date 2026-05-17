package org.example.structural.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Dealership
{
    private List<Car> cars = new ArrayList<Car>();

    public void addCar(String carName, int horsePower, String engineName)
    {
        Engine engine = EngineFactory.getEngine(engineName,  horsePower);
        Car car = new Car(engine,carName );
        cars.add(car);
    }

    public List<String> getCars()
    {
        List<String> output = new ArrayList<>();
        for (Car car : cars)
        {
            output.add(car.getCar());
        }
        return output;
    }
}
