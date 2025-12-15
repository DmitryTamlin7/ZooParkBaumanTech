package zoo.animals;

import zoo.diet.Diet;
import zoo.diet.MealDiet;


/**
 * Класс Lion - конкретная реализация животного.
 * <p>
 * Реализует принцип LSP:
 * объект Lion может использоваться везде, где ожидается Animal.
 */

public class Lion implements Animal {

    private final String name;
    private final Diet diet;

    public Lion(String name ) {
        this.name = name;
        this.diet = new MealDiet();
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
        return "Я Лев - Царь зверей, живу в зоопарке";
    }
}
