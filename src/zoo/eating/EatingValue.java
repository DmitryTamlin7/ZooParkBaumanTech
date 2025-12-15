package zoo.eating;

import zoo.animals.Animal;

public class EatingValue implements EatService {

    @Override
    public void eat(Animal animal) {
        System.out.printf("%s Собирается обедать и будет есть %s",
                animal.getName(), animal.getDiet().getType());
    }
}
