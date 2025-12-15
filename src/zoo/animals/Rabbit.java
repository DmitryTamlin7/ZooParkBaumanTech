package zoo.animals;

import zoo.diet.Diet;
import zoo.diet.PlantsDiet;

public class Rabbit implements Animal {
    private final String name;
    private final Diet diet;

    public Rabbit(String name) {
        this.name = name;
        this.diet = new PlantsDiet();
    }

    @Override
    public Diet getDiet() {
        return diet;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Я кролик, живу в зоопарке";
    }
}
