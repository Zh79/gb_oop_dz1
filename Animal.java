
public abstract class Animal {
    private String AnimalBreed;
    private String AnimalName;
    private String AnimalColour;

    
    public void SetAnimalBreed (String animalBreed){
        this.AnimalBreed = animalBreed;
    }
    public void SetAnimalName (String animalName){
        this.AnimalName = animalName;
    }
    public void SetAnimalColour (String animalColour){
        this.AnimalColour = animalColour;
    }

    public String GetAnimalBreed() {return AnimalBreed;}
    public String GetAnimalName() {return AnimalName;}
    public String GetAnimalColour() {return AnimalColour;}
}