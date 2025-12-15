package zoo.staff;

import zoo.animals.Animal;
import zoo.medical.MedicalService;

public class Veterinar implements  Vet{
    private final MedicalService medicalService;

    public Veterinar(MedicalService medicalService) {
        this.medicalService = medicalService;
    }

    @Override
    public void heal(Animal animal) {
        medicalService.checkHealth(animal);
    }
}
