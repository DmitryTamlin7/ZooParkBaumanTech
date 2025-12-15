package zoo.animals;
import zoo.diet.Diet;

/**
 * Базовый интерфейс для всех животных зоопарка.
 * <p>
 * Реализация принципа OCP:
 * <p>
 * система открыта для расширения - можно добавлять новые виды животных,
 * не изменяя существующий код.
 * <p>
 */

public interface Animal {
    String getName();
    Diet getDiet();

    void move();
}
