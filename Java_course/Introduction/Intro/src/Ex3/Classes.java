package Ex3;

public class Classes {

    String name;
    int age;

    public Classes(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String get_data(){
        return "This user is " + this.name + " and is " + this.age + " years old.";
    }

    @Override
    public String toString(){
        return "This user is " + this.name + " and is " + this.age + " years old.";
    }
}
