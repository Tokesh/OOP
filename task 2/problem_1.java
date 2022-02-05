/* Problem #1
vv Create class Animal and a derived class of Animal at your choice (Cat,
dog, crocodile, etc…). In a subclass (or derived class) demonstrate :
§ vv the methods overriding and overloading of the base class
methods.
§ vv The use of super() keyword with and without parameters */



abstract class Animal {
    String color = "white";
    java.util.Date date_born;
    int weight;
    protected Animal(){
        date_born = new java.util.Date();
    }
    protected Animal(String color, int weight){
        date_born = new java.util.Date();
        this.color = color;
        this.weight = weight;
    }
    public String sound_an(){
        return "not implemented";
    }
    public String health_passport(){
        return "Color: " + color + "\nWeight: " + weight +" kg";
    }
}

class Cat extends Animal{
    String name;
    String breed = "Casual";
    Cat(){
        super();
        weight = 5;
        name = "Barsik";
    }
    Cat(String name, String breed, String color, int weight){
        super(color, weight);
        this.name = name;
        this.breed = breed;
    }
    @Override
    public String sound_an(){
        return "Meow-Meow!";
    }
    //Overloading
    public String health_passport(int price){
        return "Name of cat: " + name + "\nBreed of cat: " + breed + "\nPrice: " + price;
    }

}




class problem_1{
    public static void main(String args[]){
        Cat A = new Cat();
        System.out.println(A.health_passport(522));
    }
}