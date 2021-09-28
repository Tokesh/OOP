class University{
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
    public int students_number = 0;
    public Students[] Studentz = new Students[20];
    Studentz[0] = Students("Niyazbek", 4.0);
    
    
    
}




public class practice_time {
    public static void main(String[] args){
        
    }
}

/*
TASK-1: Add at least 2 more data fields with different access modifiers
TASK-2: Add at least 2 more methods with different access modifiers
TASK-3: Create a class University that includes Student as a data field (group of students, if possible)
*/
