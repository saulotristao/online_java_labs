package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 1:
 *
 *      Create three classes, all of which can be inside this file. The first class (the controller)
 *      should have the main method. The main method should create at least two objects using the
 *      constructors of the second and third class. The second and third class should each have at least
 *      three instance variables that should be set using the constructor when an object is created.
 *
 *      Once the objects are created, try changing the values of some of the instance variables.
 *
 *      Think about some of the examples we have seen from the lectures or Confluence Docs.
 *
 *      Be creative. Have some fun. Using Java objects you can model just about anything you want.
 *      Cars, animals, poker games, sports teams, trees, beers, people and so on.
 */

class HorseRider {

    public static void main(String[] args) {
        Horse totsie = new Horse(10, "Thoroughbred", 6.1 );
        Rider saulo = new Rider(30,  174.0,  5.9);

        System.out.println(saulo.age);

        System.out.println(totsie.getHeight());

        saulo.age = 31;
        totsie.setHeight(6.3);

        System.out.println(saulo.age);
        System.out.println(totsie.getHeight());
    }

}

class Horse{
    private int age;
    private String breed;
    private double height ;

    public Horse (int age, String breed,double height){
        this.age = age;
        this.breed = breed;
        this.height = height;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public double getHeight() {
        return height;
    }
}

class Rider {
    int age;
    double weight;
    double height;

    public Rider (int age, double weight,double height) {
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
}
