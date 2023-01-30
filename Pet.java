import java.util.ArrayList;

class AnimalPet{
    String aBreed;
    String aName;
    String aColour;
}

public class Pet extends Animal {

    public String PetName;

    public Pet(String petName){
        this.PetName = petName;
    }

    ArrayList<AnimalPet> listAnimal = new ArrayList<>();

    public void AddAnimal(String animalBreed, String animalName, String animalColour){
        AnimalPet ap = new AnimalPet();
        SetAnimalBreed(animalBreed);
        SetAnimalName(animalName);
        SetAnimalColour(animalColour);
        ap.aBreed = GetAnimalBreed();
        ap.aName = GetAnimalName();
        ap.aColour = GetAnimalColour();
        listAnimal.add(ap);
    }

    public ArrayList<AnimalPet> getAnimalList(){
        return listAnimal;
    }
}
