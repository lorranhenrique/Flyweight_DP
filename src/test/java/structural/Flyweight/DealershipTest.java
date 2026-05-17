package structural.Flyweight;

import org.example.structural.Flyweight.Dealership;
import org.example.structural.Flyweight.EngineFactory;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DealershipTest
{
    @Test
    public void shouldReturnCorrectCars()
    {
        Dealership dealership = new Dealership();
        dealership.addCar("Monza",180,"V8");
        dealership.addCar("Celta preto",5000,"Uma pipa");
        dealership.addCar("Honda civic",300,"V5");
        dealership.addCar("Mclaren p1",500,"V²");
        dealership.addCar("Monza",180,"V8");


        List<String> saida = Arrays.asList(
                "Car Monza with a V8 Engine and 180 of horsepower",
                "Car Celta preto with a Uma pipa Engine and 5000 of horsepower",
                "Car Honda civic with a V5 Engine and 300 of horsepower",
                "Car Mclaren p1 with a V² Engine and 500 of horsepower",
                "Car Monza with a V8 Engine and 180 of horsepower");

        assertEquals(saida,dealership.getCars());
    }

    @Test
    public void shouldReturnTheCorrectNumberOfEngines(){
        Dealership dealership = new Dealership();
        dealership.addCar("Monza",180,"V8");
        dealership.addCar("Celta preto",5000,"Uma pipa");
        dealership.addCar("Honda civic",300,"V5");
        dealership.addCar("Mclaren p1",500,"V²");
        dealership.addCar("Monza",180,"V8");

        assertEquals(4, EngineFactory.getEnginesCount());
    }
}
