package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 3:
 *
 *      Create at least three example classes (class1, class2, class3) that demonstrate comfort
 *      in creating multiple classes with multiple methods, and then call between those methods across classes.
 *      These methods can perform any task, such as getter/setter methods or simple addition/subtraction.
 *      1) Class1 should have the main method.
 *      2) The main method then needs to create an object of class1, class2, class3.
 *      3) The main method should then  call one or more non-static methods in class2 and class3.
 *
 */

class Cartotravel extends Car{

    private Passenger alpha;

    public Cartotravel(int passengers, String brand, double timetoleave, Passenger alpha) {
        super(passengers, brand, timetoleave);
        this.alpha = alpha;
    }

    public static void main(String[] args) {
        Passenger lucas = new Passenger(28,5.8, 176);
        Cartotravel beta = new Cartotravel(4, "ford", 12.5, lucas);
        System.out.println(lucas.getAge());
        System.out.println(beta.getBrand());
        beta.setBrand("nissan");
        lucas.setAge(30);
        System.out.println(lucas.getAge());
        System.out.println(beta.getBrand());

    }
}

class Passenger{
    private int age;
    private double height;
    private double weight;

    public Passenger(int age, double height, double weight) {
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
}

class Car{
    private int passengers;
    private String brand;
    private double timetoleave;

    public Car( int passengers, String brand, double timetoleave){
        this.passengers = passengers;
        this.brand = brand;
        this.timetoleave = timetoleave;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setTimetoleave(double timetoleave) {
        this.timetoleave = timetoleave;
    }

    public int getPassengers() {
        return passengers;
    }

    public String getBrand() {
        return brand;
    }

    public double getTimetoleave() {
        return timetoleave;
    }
}
