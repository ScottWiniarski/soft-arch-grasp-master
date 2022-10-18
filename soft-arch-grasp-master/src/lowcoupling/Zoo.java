package lowcoupling;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    /*
    Modify the Zoo class. A Zoo should be able to
    contain a Lion and a Monkey in a single list.
     */

    //private List<Lion> lions = new ArrayList<>();
    private List<Animal> animals = new ArrayList();

    /*public void addLion(Lion lion) {
        animals.add(String.valueOf(lion));
    }
    public void addMonkey(Monkey monkey){
        animals.add(String.valueOf(monkey));
    }*/

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }
}
