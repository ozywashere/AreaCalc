import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello from JAVA WORLD");
        //Calculate the area and circumference of a circle
        //Area = PI * r * r
        //Circumference = 2 * PI * r

        Scanner input = new Scanner(System.in);
        double PI = 3.14, area, circumference;
        System.out.println("Enter the radius of the circle r : ");
        int r = input.nextInt();
        area = PI * r * r;
        circumference = 2 * PI * r;
        System.out.println("Area of the circle is : " + area);
        System.out.println("Circumference of the circle is : " + circumference);

    }
}