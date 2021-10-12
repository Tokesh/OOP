import java.util.*;


class DragonLaunch{
    Stack st = new Stack();
    public void kidnap(Person p){
        if(p.z == Gender.MALE) st.push(1);
    }
}

class Person{
    public Gender z;
    Person(String gender){
        if(gender == "female") z = Gender.FEMALE;
        else z = Gender.MALE;
        
    }
    @Override
    public String toString() {
        return z.toString();
    }
}

public class week7 {
    public static void main(String args[]){
        
        Person zxc = new Person("female");
        System.out.print(zxc.toString());
    }
}

enum Gender{
    FEMALE,
    MALE
}