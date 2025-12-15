package zoo.exhibition;

import zoo.animals.Animal;
import java.util.List;

/**
 * Сервис организации выставок животных.
 * <p>
 * Реализация принципа OCP:
 * возможно добавление новых типов выставок
 * без изменения существующего кода.
 */

public interface ExhibitionService {
    void organize(List<Animal> animals);
}
