package org.example.structural.Flyweight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EngineFactory
{
    public static Map<String, Engine> engines = new HashMap<String, Engine>();

    public static Engine getEngine(String name, int horsePower)
    {
        Engine engine = engines.get(name);
        if(engine == null){
            engine = new Engine(name,horsePower);
            engines.put(name, engine);
        }
        return engine;
    }

    public static int getEnginesCount()
    {
        return engines.size();
    }

}
