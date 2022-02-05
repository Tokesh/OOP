/* Create the abstract class for 3D shapes, e.g., volume(), surfaceArea() (add other
methods at your choice!). Then create data types Cylinder, Sphere, Cube
extending this class. */


abstract class d3_shape {
    private String color = "white";
    private boolean filled = false;
    private java.util.Date dateCreated;
    protected d3_shape() {
        dateCreated = new java.util.Date();
    }
    protected d3_shape(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }
    public abstract double volume();
    public abstract double surfaceArea();
}


class cylinder extends d3_shape{
    int radius;
    int height;
    cylinder(){
        
        super();
        radius = 1;
        height = 1;
    }
    cylinder(int radius,int height){
        this.radius = radius;
        this.height = height;
    }
    cylinder(String color, boolean filled, int radius, int height){
        super(color,filled);
        this.radius = radius;
        this.height = height;
    }
    public double volume(){
        return Math.PI * radius * radius * height;
    }
    public double surfaceArea(){
        return 2*Math.PI*radius*height + 2*Math.PI*radius*radius;
    }
    public double sideArea(){
        return 2*Math.PI*radius*height;
    }
}


class Sphere extends d3_shape{
    int radius;
    Sphere(){
        super();
        radius = 1;
    }
    Sphere(int radius){
        this.radius = radius;
    }
    Sphere(String color, boolean filled, int radius){
        super(color,filled);
        this.radius = radius;
    }
    public double volume(){
        return (Math.PI * radius * radius * radius * 4)/ 3;
    }
    public double surfaceArea(){
        return Math.PI * radius * radius * 4;
    }
    public int getDiametr(){
        return radius*radius;
    }
}


class Cube extends d3_shape{
    int side;
    Cube(){
        super();
        side = 1;
    }
    Cube(int side){
        this.side = side;
    }
    Cube(String color, boolean filled, int side){
        super(color,filled);
        this.side = side;
    }
    public double volume(){
        return side * side * side;
    }
    public double surfaceArea(){
        return 6 * side * side;
    }
    public double getDiametr(){
        return side * Math.sqrt(3);
    }
}

public class problem_2 {
    public static void main(String args[]){
        cylinder z = new cylinder("blue", true, 3, 5);
        System.out.println(z.volume());
        System.out.println(z.surfaceArea());
    }
}
