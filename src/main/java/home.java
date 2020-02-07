import java.util.*;

public class home {
    ArrayList<Animal> pets = new ArrayList<Animal>();

    public void adoptPet(Animal pet)
    {
        pets.add(pet);
    }
    public void makeAllSounds(){
        for(Animal a: pets)
        {
            a.sounds();
        }
    }
}