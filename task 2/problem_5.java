//Person - название занято класса в других заданиях, использую Personz;

class Personz{
    private String name;
    private String address;
    public Personz(String name, String address){
        this.name = name;
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "Person[name = " + name + ",address = " + address + "]";
    }
}


class Student extends Personz{
    private String program;
    private int year;
    private double fee;
    Student(String name, String address, String program, int year, double fee){
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }
    public String getProgram() {
        return program;
    }
    public void setProgram(String program) {
        this.program = program;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }public double getFee() {
        return fee;
    }public void setFee(double fee) {
        this.fee = fee;
    }
    @Override
    public String toString() {
        return "Student[Person[name= " + getName() +",address = " + getAddress() + "], program= " + program + ",year = " + year + ", fee = " + fee + "]";
    }
}

class Staff extends Personz{
    private String school;
    private double pay;
    Staff(String name, String address, String school, double pay){
        super(name, address);
        this.school = school;
        this.pay = pay;
    }
    public String getSchool() {
        return school;
    }public void setSchool(String school) {
        this.school = school;
    }public double getPay() {
        return pay;
    }public void setPay(double pay) {
        this.pay = pay;
    }@Override
    public String toString() {
        return "Staff[Person[name= " + getName() +",address = " + getAddress() + "], school= " + school + ",pay = " + pay+ "]";
    }
}

public class problem_5 {
    public static void main(String args[]){
        Personz z = new Personz("Jason", "Stathem street");
        System.out.println(z.toString());
        Student x = new Student("Mike", "Tyson street", "Bachelor", 2020, 5.05d);
        System.out.println(x.toString());
        Staff c = new Staff("Tokesh", "Almaty", "school #35", 325.40d);
        System.out.println(c.toString());
    }
}
