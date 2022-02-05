import java.util.HashSet;
import java.util.Iterator;

/* 
    Для RSG можно несколько подходов использовать.
    Если мне постоянное новое рандомное предложение нужно - я могу взять массив и его заполнить изначально запомнив его длину
    и потом уже через Math.Random() * size
    Но мы сегодня на лекции проходили разницу HashSet, TreeSet, LinkedHashSet
    Основная разница в них, что Hashset он хранится по порядку хешей, из-за этого нам сложно понять как это лежит и считается не отсортированным
    и я решил использовать здесь его. 
 */


class RSG{
    HashSet<String>Cursed = new HashSet<>();
    int size;
    RSG(){
        size = 0;
    }
    void add(String s){
        Cursed.add(s.toLowerCase());
        size += 1;
    }
    void print(){
        Iterator<String> itr = Cursed.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
    }
}


class random_sentence_generator{
    public static void main(String args[]){
        RSG ex = new RSG();
        ex.add("Be happy!");
        ex.add("All problems have solution!");
        ex.add("Just wait a little to solve all your problems");
        ex.add("Enjoy by every minute with your parents and relatives!");
        ex.print();
    }
}