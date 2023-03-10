import java.util.ArrayList;

public class Persona extends Human {

    public Library PersLibr;
    public Pet PersPet;


    int gender;  // 0 ж 1 м
    int spouse; // 0 n 1 y
    String mother;
    String father;
    int hasChild;   // 0 n 1 y

    public Persona(String name, String sex, int age, int spouse, String mother, String father, int hasChild, String persLibr, String persPet){
        SetName(name);
        SetSex(sex);
        SetAge(age);
        this.spouse=spouse;
        this.mother=mother;
        this.father=father;
        this.hasChild=hasChild;
        this.PersLibr = new Library(persLibr);
        this.PersPet = new Pet(persPet);
    }

    


    public static String info(Persona p){
        String lineInfo = "";
        if (p.spouse == 1){
            lineInfo = lineInfo + "Привет, меня зовут " + p.name + " моих маму и папу зовут " + p.mother + " и "
            + p.father + " у меня есть супруг(а)";
            if (p.hasChild == 0){
                lineInfo = lineInfo + " и пока нет детей";
            }
            else {
                lineInfo = lineInfo + " и есть дети";
            }
        }
        else{
            lineInfo = lineInfo + "Привет, меня зовут " + p.name + " моих маму и папу зовут " + p.mother + " и "
            + p.father + " у меня пока нет супруга(и)";
            if (p.hasChild == 0){
                lineInfo = lineInfo + " и пока нет детей";
            }
            else {
                lineInfo = lineInfo + " и есть дети";
        }
    }
        return lineInfo;
        
    }


    ArrayList <Persona> list = new ArrayList<>();
    
    public void AddName(Persona p){
        list.add(p);
    }

    public ArrayList<Persona> getListName(){
        return list;
    }
    @Override
    public void Voice() {
        String name = GetName();
        System.out.println("Hello, my name " + name);
        
    }
    
}
