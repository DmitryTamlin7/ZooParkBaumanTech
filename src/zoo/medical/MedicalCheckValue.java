package zoo.medical;

import zoo.animals.Animal;

public class MedicalCheckValue implements MedicalService {
    @Override
    public void checkHealth(Animal animal) {
        System.out.printf("%s Проходит мед. Обследование\n", animal.getName());
    }
}
