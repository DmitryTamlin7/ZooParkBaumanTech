package zoo.enclosure;
import zoo.animals.Animal;
import java.util.ArrayList;
import java.util.List;

/**
 * Вольер для содержания животных.
 * <p>
 * Реализует принцип SRP:
 * класс отвечает только за хранение и размещение животных.
 */

public class Enclosure {
    private int capasity;
    private List<Animal> animalsList = new ArrayList<>();

    public Enclosure(int capasity) {
        this.capasity = capasity;
    }

    public boolean addAnimal(Animal animal){
        if (animalsList.size() < capasity){
            animalsList.add(animal);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Enclosure{" +
                "animalsList=" + animalsList +
                ", capasity=" + capasity +
                '}';
    }
}
