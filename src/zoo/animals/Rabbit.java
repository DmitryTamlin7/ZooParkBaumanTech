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
    public void move() {
        System.out.printf("%s Скачет с морковью в зубах\n", getName());
    }
}
