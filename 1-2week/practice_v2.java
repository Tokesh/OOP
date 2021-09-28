public class practice_v2 {
    public static void main(String args[]){
        Students name1 = new Students("Niyazbek", 3.67f);
        name1.showNumber();
        System.out.println(name1.id);
        name1.showGpa();
        Students name2 = new Students("Konstantin", 4.0f);
        name2.showNumber();
        System.out.println(name1.id);
        System.out.println(name2.id);
    }    
}

class Students{
    String name;
    float gpa;
    int id;
    static int numberofstudents = 0;
    Students(String n, float g){
        name = n;
        gpa = g;
        numberofstudents += 1;
        id = numberofstudents;
    }
    void showNumber(){
        System.out.println(numberofstudents);
    }
    void showGpa(){
        System.out.println(gpa);
    }
}

