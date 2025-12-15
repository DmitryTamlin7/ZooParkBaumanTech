package zoo.staff;

import zoo.animals.Animal;

/**
 * Сотрудник зоопарка - смотритель.
 * <p>
 * Реализация принципа ISP:
 * класс реализует только интерфейс Feeder,
 * не содержит методов, не относящихся к его ответственности.
 * <p>
 * Реализация DIP:
 * зависимость от FeedingService представлена через интерфейс.
 */

public interface Feeder {
    void feed(Animal animal);
}
