import java.util.Calendar;

public class practice_v3 {
    public static void main(String args[]){
        Students name1 = new Students("Niyazbek", 3.67f, 2020);
        Students name2 = new Students("Konstantin", 4.0f, 2020);
        System.out.println(name1.calendar.get(Calendar.year) - name1.postuplenie.get(Calendar.year));
        
        
    }    
}

class Students{
    String name;
    float gpa;
    int id;
    String specialty;
    static Calendar calendar = new GregorianCalendar(2021, 8 , 1);
    Calendar postuplenie;
    static int numberofstudents = 0;
    Students(String n, float g, int y){
        name = n;
        gpa = g;
        numberofstudents += 1;
        id = numberofstudents;
        postuplenie= new GregorianCalendar(y,8,1);
    }
    void showNumber(){
        System.out.println(numberofstudents);
    }
    void showGpa(){
        System.out.println(gpa);
    }
}

