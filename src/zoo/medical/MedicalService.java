package zoo.medical;

import zoo.animals.Animal;

/**
 * Сервис медицинского осмотра животных.
 * <p>
 * Реализует принцип SRP - отвечает только за медицинский осмотр животных.
 */

public interface MedicalService {
    void checkHealth(Animal animal);
}
