class Studentz{
	private String name;
	private String id;
	private double gpa = 4;
	private String specialty;
	private static int x;

	Studentz(String n){
		name = n;
	}

	private double getGPA(){return gpa;}
	private void setGPA(double g){
		this.gpa = g;
	}

	private static void changeNumber(int s){ // a = x = 5
		Studentz.x = s;
	}

	private static void changeName(Studentz s){ // s = s1
		s.name = "Almas";
	}

	private String getName(){
		return "Student: " + this.name;
	}

	private void printStudent(){
		System.out.println("Student: " + name);
	}
    private static void diff(Studentz arr1[],Studentz arr2[]){
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i] != null && arr2[j] != null && arr1[i].name == arr2[j].name) System.out.println(arr1[i].name);
            }
        }
    }
}

public class week5_second_part {
    public static void main(String args[]){
        Studentz[] arr1 = new Studentz[10];
        Studentz[] arr2 = new Studentz[10];
        arr1[0] = new Studentz("Sanzhar");
        arr1[1] = new Studentz("Dauren");
        arr1[2] = new Studentz("Askar");
        arr2[0] = new Studentz("Askar");
        arr2[1] = new Studentz("Bobur");
        arr2[2] = new Studentz("Beisenbek");
    }
}
