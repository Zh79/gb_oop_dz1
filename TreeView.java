public class TreeView {
    public static void view(Persona root, int num){
        
        System.out.println(root.name);
        for (Persona a: root.getListName()) {
            view(a, num+1);
        }
    }
    public static void info(Persona p){
        System.out.println(Persona.info(p)); 
    }
    public static void BookView(Persona root){
        
        System.out.println(root.PersLibr.LibraryName);
        for (LibraryBooks a: root.PersLibr.listBook) {
            System.out.println(a.bAuthor + " " + a.bName);
        }
    }
    public static void PetView(Persona root){
        System.out.println("У "+ root.name + " есть");
        System.out.println(root.PersPet.PetName);
        for (AnimalPet a: root.PersPet.listAnimal) {
            System.out.println("Породы "+ a.aBreed + " по имени " + a.aName + " цвета " + a.aColour);
        }
    }
}
