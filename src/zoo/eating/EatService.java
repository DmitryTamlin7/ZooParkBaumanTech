package zoo.eating;

import zoo.animals.Animal;

/**
 * Сервис кормления животных.
 * <p>
 * Реализует принцип SRP - отвечает только за процесс кормления.
 * <p>
 * Реализует принцип DIP - работает с абстракцией Animal,
 * а не с конкретными реализациями.
 */

public interface EatService {
    void eat(Animal animal);
}



