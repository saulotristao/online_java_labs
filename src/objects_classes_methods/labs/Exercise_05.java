package objects_classes_methods.labs;

class Books{
    int weigth;
    int position;
    static int numberBooks;

    public Books(int weigth) {
        this.weigth = weigth;
        this.position = numberBooks + 1;
        numberBooks++;
    }
}

class Library{

    public static void main(String[] args) {

        Books alpha = new Books (1);
        System.out.println(alpha.numberBooks);
        System.out.println(alpha.position);
        Books beta = new Books(5);
        System.out.println(beta.numberBooks);
        System.out.println(alpha.numberBooks);
        // System.out.println(beta.position);
        Books charlie = new Books(9);
        System.out.println(charlie.position);
        System.out.println(beta.position);
        System.out.println(alpha.position);
        System.out.println(alpha.numberBooks);

    }
}

/**
 * Objects, Classes and Methods Exercise 5:
 *
 *      Demonstrate the use of static instance variables. Create a class with at least one static variable
 *      and one non-static variable. Create a few objects of that class and set the values of the variables.
 *      Use System.out.println to demonstrate when the variables are changed.
 *
 */
