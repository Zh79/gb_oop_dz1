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
}
