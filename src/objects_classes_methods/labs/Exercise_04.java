package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 4:
 *
 *      Demonstrate method overloading with at least three overloaded methods.
 *
 */




class Automobiles{

    double speed;
    double passengers;
    String type;

    public Automobiles(double speed, double passengers, String type) {
        this.speed = speed;
        this.passengers = passengers;
        this.type = type;
    }

    public static void main(String[] args) {
        Automobiles audi = new Automobiles(1.0,1, "audi");
        System.out.println(audi.getSpeed());
        audi.accelerate(2);
        System.out.println(audi.getSpeed());
        audi.accelerate(2,2);
        System.out.println(audi.getSpeed());
        audi.accelerate(3,5);
        System.out.println(audi.getSpeed());

    }
    //overload method accelerate
    public double accelerate(double a){
        this.speed = speed + a;
        return speed;
    }
    // overload method accelerated
    public double accelerate(int a, int b) {
        this.speed = speed * a * b ;
        return speed;
    }
    // overload method thrid time
    public double accelerate (int a, double b){
        this.speed = speed * a + b;
        return speed;
    }

    public double getSpeed() {
        return speed;
    }

    public double getPassengers() {
        return passengers;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setPassengers(double passengers) {
        this.passengers = passengers;
    }


}




