
public class mainapp{
    public static void main(String[] args){

        Persona father = new Persona("John", 1, 1, "Petra", "Petr", 1);
        Persona mother = new Persona("Jackie", 0, 1, "Anna", "Max", 1);
        Persona sister = new Persona("Marta", 0, 1, "Jackie", "John", 1);
        Persona son = new Persona("Mike", 1, 0, "Jackie", "John", 0);
        Persona  grandson = new Persona("Mike", 1, 0, "Marta", "Sergei", 0);
        father.AddName(son);
        father.AddName(sister);
        sister.AddName(grandson);
        // TreeView.view(father, 1);
       TreeView.info(son);
    }
}