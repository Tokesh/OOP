/*
V TASK-1: Create two groups of students (2 arrays), and initialize them;
V TASK-2: Create a static method that compares two student arrays, 
		and returns how many students from 2 have the same name;
V TASK-3: Modify the Student to make it an immutable class;
TASK-4: Create the Classes Course and Faculty, 
		and demonstrate their relationships to the Student class like in the lecture slides.
*/


class Faculty{
    String FacultyName;
    String[] teachersID = new String[10];
    static int teachers_number = 0;
    Faculty(String name){
        FacultyName = name;
    }
    public void addTeacher(String ID){
        teachersID[teachers_number] = ID;
        teachers_number++;
    }
}

class Course{
    private int count_courses;
    String[] teachersID_arr = new String[6];
    Course(String[] teachersID, int cnt){
        teachersID_arr = teachersID;
        count_courses = cnt;
    }
}

class Student{
	private String name;
	public String id;
	private double gpa = 4;
	String specialty;
	private static int x;

	Student(String n){
		name = n;
	}

	public double getGPA(){return gpa;}
	public void setGPA(double g){
		this.gpa = g;
	}

	static void changeNumber(int s){ // a = x = 5
		Student.x = s;
	}

	static void changeName(Student s){ // s = s1
		s.name = "Almas";
	}

	public String getName(){
		return "Student: " + this.name;
	}

	public void printStudent(){
		System.out.println("Student: " + name);
	}
    static void diff(Student arr1[],Student arr2[]){
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i] != null && arr2[j] != null && arr1[i].name == arr2[j].name) System.out.println(arr1[i].name);
            }
        }
    }
}


public class week5{
    public static void main(String args[]){
        Student[] arr1 = new Student[10];
        Student[] arr2 = new Student[10];
        arr1[0] = new Student("Sanzhar");
        arr1[1] = new Student("Dauren");
        arr1[2] = new Student("Askar");
        arr2[0] = new Student("Askar");
        arr2[1] = new Student("Bobur");
        arr2[2] = new Student("Beisenbek");
        Student.diff(arr1,arr2);
    }
}