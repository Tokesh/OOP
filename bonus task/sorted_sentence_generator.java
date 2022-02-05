import java.util.TreeSet;
import java.util.Iterator;

/* 
    Для SSG можно несколько подходов использовать.
    Cегодня на лекции проходили разницу HashSet, TreeSet, LinkedHashSet
    Для SSG здесь можно использовать TreeSet, который позволяет нам отсортировать входящие нам слова
    То есть если вы заметите, TreeSet нам помогает их отсортировать по лексикографическим значениям
    А дальше мы можем положить их в массив и каждый раз выстаскивать рандомные слова и предложения
    Если мы не хотим чтобы слова повторялись - можно добавить Map, тогда каждый раз записывать какие слова мы уже использовали
 */

class SSG{
    TreeSet<String>Cursed = new TreeSet<>();
    int size;
    SSG(){
        size = 0;
    }
    void add(String s){
        Cursed.add(s.toLowerCase());
        size += 1;
    }
    void print(){
        Iterator<String> itr = Cursed.iterator();
        String[] arr = new String[size];
        int cnt = 0;
        while(itr.hasNext()){
            String j = itr.next();
            arr[cnt++] = j;
            System.out.println(j);
        }
        
        for(int i=0;i<cnt;i++){
            System.out.print(arr[(int)(Math.random()*(double)i)]);
        }
    }
}

public class sorted_sentence_generator {
    public static void main(String args[]){
        SSG ex = new SSG();
        ex.add("Be happy!");
        ex.add("All problems have solution!");
        ex.add("Just wait a little to solve all your problems");
        ex.add("Enjoy by every minute with your parents and relatives!");
        ex.print();
    }
    
}
