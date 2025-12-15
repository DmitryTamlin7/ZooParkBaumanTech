package zoo.staff;

import zoo.animals.Animal;
import zoo.eating.EatService;

public class ZooKeeper implements Feeder {
    private final EatService eatService;

    public ZooKeeper(EatService eatService) {
        this.eatService = eatService;
    }

    @Override
    public void feed(Animal animal) {
        eatService.eat(animal);
    }
}
