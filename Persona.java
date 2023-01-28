import java.util.ArrayList;

public class Persona {

    String name;
    int gender;  // 0 ж 1 м
    int spouse; // 0 n 1 y
    String mother;
    String father;
    int hasChild;   // 0 n 1 y

    public Persona(String name, int gender, int spouse, String mother, String father, int hasChild){
        this.name=name;
        this.gender=gender;
        this.spouse=spouse;
        this.mother=mother;
        this.father=father;
        this.hasChild=hasChild;
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
    
}
