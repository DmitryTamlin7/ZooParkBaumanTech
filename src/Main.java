import zoo.animals.Animal;
import zoo.animals.Lion;
import zoo.animals.Penguin;
import zoo.animals.Rabbit;
import zoo.eating.EatService;
import zoo.eating.EatingValue;
import zoo.enclosure.Enclosure;
import zoo.exhibition.AnimalExhibitionService;
import zoo.exhibition.ExhibitionService;
import zoo.medical.MedicalCheckValue;
import zoo.medical.MedicalService;
import zoo.staff.Veterinar;
import zoo.staff.ZooKeeper;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        EatService eatService = new EatingValue();
        MedicalService medicalService = new MedicalCheckValue();
        ExhibitionService vistovka = new AnimalExhibitionService();
        Enclosure valier = new Enclosure(10);

         /**
          * Создание сотрудников (ISP + DIP)
          * */
        ZooKeeper zooKeeper = new ZooKeeper(eatService);
        Veterinar veterinar = new Veterinar(medicalService);


        Lion lion1 = new Lion("Лев Левушка");
        Rabbit rabbit1 = new Rabbit("Заяц Константин");
        Penguin penguin1 = new Penguin("Пингвин Ледик");


        eatService.eat(lion1);
        eatService.eat(rabbit1);

        /** Медицинский осмотр при приёме (SRP — отдельный сервис)
         *
         * L - Liskov substitution principle - Принцип подстановки Лискол  */
        veterinar.heal(lion1);
        veterinar.heal(rabbit1);
        veterinar.heal(penguin1);




        /** Вольер */
        valier.addAnimal(rabbit1);
        valier.addAnimal(lion1);

         /** Выставка животных (OCP — можно добавить новые типы выставок) */

        vistovka.organize(Arrays.asList(lion1, rabbit1));




    }
}