import java.util.*;


class students{
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        String lane = input.nextLine();
        String[] arr=lane.split(",");
        
        for(String w:arr){  
            System.out.println(w);  
            }  

    }
}