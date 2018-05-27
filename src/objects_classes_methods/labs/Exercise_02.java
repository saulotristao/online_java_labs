package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 2:
 *
 *      Create a class that demonstrates the following: (all methods below can be in the same class)
 *
 *      1) A static method that calls another static method.
 *      2) A static method that calls a non-static method.
 *      3) A non-static method1 that calls another non-static method2, but this time method2 should return a value to method1.
 *      4) A non-static method1 that calls another non-static method2 and passes a value to method2.
 */


class Test {

    public static void main(String[] args) {
        // calling a static method
        double testingpi = getPi();
        System.out.println(testingpi);
        // creating a object
        Test obj = new Test();
        int a = 5;
        int b = 5;
        // calling a non-static method from a static method
        boolean test = obj.isTrue(a,b);
        System.out.println(test);
        //calling a non-static method again
        obj.question3();
        obj.question4();
    }

    void question3 (){
        int a = 3;
        int b = 5;
        // calling a non-static method from a non-static method
        boolean test = isTrue(a,b);
        System.out.println(test);
    }

    double divby2 (double a){
        double b = a/2;
        return b;
    }

    void question4(){
        double c = 5;
        double d = divby2(c);
        System.out.println(d);
    }

    static double getPi(){
        double mypi = 3.1415;
        return mypi;
    }

    boolean isTrue(int a, int b){
        if (a==b){
            return true;
        }
        else {
            return false;
        }
    }

}
