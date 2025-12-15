import zoo.animals.Animal;
import zoo.animals.Lion;
import zoo.animals.Rabbit;
import zoo.eating.EatService;
import zoo.eating.EatingValue;
import zoo.enclosure.Enclosure;
import zoo.exhibition.AnimalExhibitionService;
import zoo.exhibition.ExhibitionService;
import zoo.medical.MedicalCheckValue;
import zoo.medical.MedicalService;
import zoo.staff.ZooKeeper;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Lion lion1 = new Lion("Лев Левушка");
        Rabbit rabbit1 = new Rabbit("Заяц Константин");

        EatService eatService = new EatingValue();
        MedicalService medicalService = new MedicalCheckValue();
        ExhibitionService Vistovka = new AnimalExhibitionService();
        Enclosure valier = new Enclosure(10);


        eatService.eat(lion1);
        eatService.eat(rabbit1);
        medicalService.checkHealth(lion1);
        medicalService.checkHealth(rabbit1);

        valier.addAnimal(rabbit1);
        valier.addAnimal(lion1);

        valier.toString();



    }
}