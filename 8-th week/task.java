

class Set<T>{
    public T[] arr = (T[])new Object[100];
    public int act_size;
    Set(){
        act_size = 0;
    }
    void insert(T element){
        arr[act_size++] = element;
    }
    void delete(T element){
        for(int i=0;i<act_size;i++){
            if(arr[i].equals(element)){
                for(int j=i;j<act_size-1;j++){
                    arr[j] = arr[j+1];
                }
                act_size--;
            }
        }
    }
    T find_me(T element){
        for(int i=0;i<act_size;i++){
            if(arr[i].equals(element)){
                return arr[i];
            }
        }
        return null;
    }
    void print(){
        for(int i=0;i<act_size;i++){
            System.out.println(arr[i]);
        }
    }
    boolean equal_check(Set z, Set x){
        if(z.act_size != x.act_size) return false;
        for(int i=0;i<z.act_size;i++){
            if(!z.arr[i].equals(x.arr[i])) return false;
        }
        return true;
    }

}

class first_task{
    public static void main(String args[]){
        Set<String> zxc = new Set<>();
        zxc.insert("be happy");
        zxc.insert("make it happen");
        zxc.insert("lose your attention");
        zxc.insert("make it happen");
        zxc.insert("random text");
        zxc.insert("be carefull please");
        //zxc.delete("make it happen");
        Set<String> amr = new Set<>();
        amr.insert("be happy");
        amr.insert("make it happen");
        amr.insert("lose your attention");
        amr.insert("make it happen");
        amr.insert("random text");
        amr.insert("be carefull pleasef");
        System.out.println(zxc.equal_check(zxc, amr));

    }
}
