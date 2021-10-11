
class Node{
    public int value;
    private Node left;
    private Node right;
    Node(int value){
        this.value = value;
    }
    public Node getRight() {
        return right;
    }
    public Node getLeft() {
        return left;
    }
    public void setRight(Node right) {
        this.right = right;
    }
    public void setLeft(Node left) {
        this.left = left;
    }
}

class LinkedList{
    private Node first;
    private Node last;
    private int size;
    LinkedList(){
        first = null;
        last = null;
        size = 0;
    }
    public void add(int val){
        Node temp = new Node(val);
        if(first == null){
            first = temp;
            last = temp;
        }else{
            last.setRight(temp);
            last = temp;
        }
        size++;
    }
    public void add(int val, int indexx){
        Node temp = first;
        while(indexx != 0){
            indexx--;
            temp = temp.getRight();
        }
        Node newVal = new Node(val);
        if(temp != null && temp.getRight() != null){
            newVal.setRight(temp.getRight());
            temp.setRight(newVal);
        }else if(temp == first){
            temp.setRight(first);
            first = temp;
        }else if(temp.getRight() == null){
            temp.setRight(newVal);
        }
    }
    public void removeVal(int val){
        if(size == 0) return;
        Node temp = first;
        if(temp.value == val){
            if(temp.getRight() != null){
                first = first.getRight();
            }
        }
        while(temp != null){
            if(temp != null && temp.getRight() != null && temp.getRight().value == val){
                if(temp.getRight().getRight() != null){
                    temp.setRight(temp.getRight().getRight());
                }else{
                    temp.setRight(null);
                }
                break;
            }
            temp = temp.getRight();
        }
    }
    public boolean removeInd(int index){
        Node temp = first;
        if(index == 0){
            first = first.getRight();
            return true;
        }
        while(temp != null && index != 1){
            temp = temp.getRight();
            index--;
        }
        if(temp == null || index != 1) return false;
        if(temp.getRight() != null){
            if(temp.getRight().getRight() != null){
                temp.setRight(temp.getRight().getRight());
            }else{
                temp.setRight(null);
            }
        }
        return true;
    }
    public void print(){
        Node temp =first;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.getRight();
        }
    }
    public int getSize() {
        return size;
    }

}


public class week6B {
    public static void main(String args[]){
        LinkedList mylist = new LinkedList();
        mylist.add(4);
        mylist.add(6);
        mylist.removeVal(4);
        mylist.print();
    }
    
}
