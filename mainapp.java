
public class mainapp{
    public static void main(String[] args){

    //     Persona father = new Persona("John", null, 1, 1, "Petra", "Petr", 1);
    //     Persona mother = new Persona("Jackie", null, 0, 1, "Anna", "Max", 1);
    //     Persona sister = new Persona("Marta", null, 0, 1, "Jackie", "John", 1);
    //     Persona son = new Persona("Mike", null, 1, 0, "Jackie", "John", 0);
    //     Persona  grandson = new Persona("Mike", null, 1, 0, "Marta", "Sergei", 0);
    //     father.AddName(son);
    //     father.AddName(sister);
    //     sister.AddName(grandson);
    //     // TreeView.view(father, 1);
    //    TreeView.info(son);
        Persona papa = new Persona("Otec", "m", 33, 1, "Babushka", "Ded", 1, "Lib1", "Cats");
        Persona son = new Persona("Sin", "m", 13, 0, "Mama", "Otec", 0, "Lib2", "Dogs");
        papa.PersLibr.AddBook("Пушкин", "So4ineniya", "RU");
        son.PersPet.AddAnimal("Buldog", "Fedor", "Brown");
        son.PersPet.AddAnimal("Korgi", "Pupsik", "Dold");
        TreeView.BookView(papa);
        TreeView.PetView(son);
    }
}