package zoo.animals;

import zoo.diet.Diet;
import zoo.diet.FishDiet;

public class Penguin  implements  Animal{
    private final String name;
    private final Diet diet = new FishDiet();

    public Penguin(String name) {
        this.name = name;
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
        System.out.printf("%s плавает и забавно ходит\n", getName());
    }
}
