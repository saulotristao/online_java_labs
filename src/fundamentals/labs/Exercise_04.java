package fundamentals.labs;

/**
 * Fundamentals Exercise 4: Area and Perimeter
 *
 *      Write the necessary code to calculate the area and perimeter of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        double radius = 3.14;
        double height = 5;
        double pi = 3.14;

        double base_area = (radius * radius) * pi;
        double lateral_area = 2 * pi * radius * height;

        double total_area = base_area * 2 + lateral_area;

        System.out.println("Total area " + total_area);

    }
}
