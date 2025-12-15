package zoo.exhibition;

import zoo.animals.Animal;

import java.util.List;

public class AnimalExhibitionService implements ExhibitionService{

    @Override
    public void organize(List<Animal> animals) {
        System.out.println("Выставка животных будет состоять из\n");
        animals.forEach(animal -> System.out.println(animal.getName()));
    }
}
