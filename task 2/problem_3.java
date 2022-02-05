import java.util.Date;
import java.util.HashSet;
import java.util.Vector;

class Person implements Comparable<Person>{
    public String name;
    public int age;
    private int national_id;
    protected Date date_birth;
    Person(String n, int id, int age){
        name = n;
        national_id = id;
        this.age = age;
        date_birth = new java.util.Date();
    }
    public int compareTo(Person o){
        if(o.age > age){
            return 1;
        }else if(o.age == age){
            return 0;
        }else{
            return -1;
        }
    }
    public boolean equals(Person o){
        if(o.national_id == national_id) return true;
        return false;
    }
    public int getNational_id() {
        return national_id;
    }
}
class employee extends Person{
    protected double salary;
    private int year;
    protected String insurance_number;

    employee(String n, int id, int age, int salary, int year, String insurance_number){
        super(n,id,age);
        this.salary = salary;
        this.year = year;
        this.insurance_number=insurance_number;
    }
    public int compareTo(employee o){
        if(o.salary > salary){
            return 1;
        }else if(o.salary == salary){
            return 0;
        }else{
            return -1;
        }
    }
    public boolean equals(employee o){
        if(o.getNational_id() == this.getNational_id()) return true;
        return false;
    }
}

class manager extends employee{
    
    Vector<employee> v = new Vector<employee>();

    manager(String n, int id, int age, int salary, int year, String insurance_number){
        super(n,id,age,salary, year, insurance_number);
    }
    protected void add(employee e){
        v.add(e);
    }
    public int compareTo(manager o){
        HashSet<employee>man1=new HashSet<>();
        for(int i=0;i<v.size();i++){
            man1.add(v.get(i));
        }
        HashSet<employee>man2=new HashSet<>();
        for(int i=0;i<o.v.size();i++){
            man2.add(o.v.get(i));
        }
        if(man1.size() > man2.size()){
            return 1;
        }else if(man1.size()==man2.size()){
            return 0;
        }else{
            return -1;
        }
    }
    public boolean equals(manager o){
        HashSet<employee>man1=new HashSet<>();
        for(int i=0;i<v.size();i++){
            man1.add(v.get(i));
        }
        HashSet<employee>man2=new HashSet<>();
        for(int i=0;i<o.v.size();i++){
            man2.add(o.v.get(i));
        }
        if(man1.size()==man2.size()) return true;
        return false;
    }
}



public class problem_3 {
    public static void main(String args[]){
        Person Zaur = new Person("Zaur", 666, 21);
        Person Cooman = new Person("Cooman", 111, 22);
        System.out.println(Zaur.compareTo(Cooman));
        employee Alex = new employee("Alex", 222, 24, 65000, 2015, "20B030106");
        employee Torontokyo = new employee("Hertek", 333, 24, 99999, 2019, "20BDF3432");
        System.out.println(Alex.equals(Torontokyo));
        manager Tokesh = new manager("Torekeldi", 20030106, 19, 0, 2020, "195242FD");
        manager Ilya = new manager("Ilya", 2024024, 24, 120000, 2015, "SDF4324");
        Tokesh.add(Alex);
        Tokesh.add(Torontokyo);
        System.out.println(Tokesh.compareTo(Ilya));
    }
}
