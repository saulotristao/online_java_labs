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
class Controller{
    public static void main(String[] args) {
        Minivan ford = new Minivan ("ford");
        Minivan nissan = new Minivan("nissan");
        SportCar ferrari = new SportCar("Ferrari");

        System.out.println();
        Passenger[] passengers;
        passengers = new Passenger[ford.getPassengers()];

        ford.setHasDoubleSliders(true);

        for (int a = 0; a < ford.getPassengers(); a++){
            Passenger name1 = new Passenger(a,1.1, 4.3);
            passengers[a] = name1;
        }

        ford.setPassengerArray(passengers);
        System.out.println(ford.toString());

        for(Passenger p : passengers){
            p.setAge(p.getAge()+1);
        }
        System.out.println(ford.toString());

        nissan.setPassengers(9);
        nissan.setHasDoubleSliders(false);
        passengers = new Passenger[nissan.getPassengers()];

        for (int a = 0; a < nissan.getPassengers(); a++){
            Passenger name1 = new Passenger(a,2.2, 4.3);
            passengers[a] = name1;
        }

        nissan.setPassengerArray(passengers);

        ferrari.setPassengers(5);
        ferrari.setAerofolio(true);


        passengers = new Passenger[ferrari.getPassengers()];
        for (int a = 0; a < ferrari.getPassengers(); a++){
            Passenger name1 = new Passenger(a,3.3, 4.3);
            passengers[a] = name1;

        }

        ferrari.setPassengerArray(passengers);

        System.out.println(nissan.toString());
        System.out.println(ferrari.toString());

    }
}


class Minivan extends Car{

    private int defaultPassenger = 7;
    private boolean hasDoubleSliders;

    public Minivan( String brand) {
        super(brand);
        super.setPassengers(defaultPassenger);
    }

    public boolean isHasDoubleSliders() {
        return hasDoubleSliders;
    }

    public void setHasDoubleSliders(boolean hasDoubleSliders) {
        this.hasDoubleSliders = hasDoubleSliders;
    }

    @Override
    public String toString() {
        String str = "Minivan{" +
                "numpassenger=" + getPassengers() +
                ", hasDoubleSliders=" + hasDoubleSliders +
                ", brand " + getBrand() + ", ";
        for (Passenger p : getPassengerArray()){
            str = str + p.toString();
        }
        str = str + "}";
        return str;
    }
}

class SportCar extends Car{

    private int defaultPassenger = 2;
    private  boolean aerofolio;

    public SportCar(String brand) {
        super(brand);
        super.setPassengers(defaultPassenger);
    }

    public boolean isAerofolio() {
        return aerofolio;
    }

    public void setAerofolio(boolean aerofolio) {
        this.aerofolio = aerofolio;
    }

    @Override
    public String toString() {
        String str = "SportCar{" +
                "numpassenger=" + getPassengers() +
                ", aerofolio=" + aerofolio +
                ", brand" + getBrand();
        for (Passenger p : getPassengerArray()){
            str = str + p.toString();
        }
        str = str + "}";
        return str;
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

    @Override
    public String toString() {
        return "Passenger{" +
                "age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}

class Car{
    private int passengers;
    private Passenger[] passengerArray;
    private String brand;
    private double timetoleave;

    public Car( String brand ){
        this.brand = brand;
    }

    public Passenger[] getPassengerArray() {
        return passengerArray;
    }

    public void setPassengerArray(Passenger[] passengerArray) {
        this.passengerArray = passengerArray;
    }

    public int getPassengers() {
        return passengers;
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


    public String getBrand() {
        return brand;
    }

    public double getTimetoleave() {
        return timetoleave;
    }
}
