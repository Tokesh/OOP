import java.util.*;
/* 
    Для OSG можно несколько подходов использовать.
    Cегодня на лекции проходили разницу HashSet, TreeSet, LinkedHashSet
    Здесь идеально подойдет LinkedHashSet, который будет сохранять очередность слов в предложениях
 */

class OSG{
    LinkedHashSet<String>Cursed = new LinkedHashSet<>();
    int size;
    OSG(){
        size = 0;
    }
    void add(String s){
        s = s.toUpperCase();
        String j ="";
        for(int i=s.length()-1;i>=0;i--){
            j += s.charAt(i);
        }
        Cursed.add(j);
        size += 1;
    }
    void print(){
        Iterator<String> itr = Cursed.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next() + ' ');
        }
    }
}

public class ordered_sentence_generator {
    public static void main(String args[]){
        OSG ex = new OSG();
        ex.add("Be happy!");
        ex.add("All problems have solution!");
        ex.add("Just wait a little to solve all your problems");
        ex.add("Enjoy by every minute with your parents and relatives!");
        ex.print();
    }
    
}
