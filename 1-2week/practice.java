

class TestPractice{
    public static void main(String args[]){
        Rectangle zxc = new Rectangle(5,10);
        System.out.println("The area of the rectangle is "+ zxc.getArea());
        System.out.println("The main color of rectangle: "+ zxc.getColor());
        System.out.println("The biggest side of rectangle: "+ zxc.biggest_side());
        

    }
}



class Rectangle{
    String color;
    int weight;
    int height;
    Rectangle(){
        weight = 1;
        height = 1;
        color = "Black";
    }
    Rectangle(String newColor){
        weight = 1;
        height = 1;
        color = newColor;
    }
    Rectangle(int weight_1,int height_2){
        weight = weight_1;
        height = height_2;
        color = "Black";
    }
    double getArea() {
        return weight* height;
    }
    String getColor(){
        return this.color;
    }
    int biggest_side(){
        return Math.max(weight, height);
    }
}