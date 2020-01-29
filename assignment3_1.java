import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Get input
    System.out.println("Please enter the radius of the pentagon.");
    double radius = input.nextDouble();

    // Calculate area.
    double s = 2 * radius * Math.sin(Math.PI / 5);
    double area = (5 * s * s) / (4 * Math.tan(Math.PI / 5));

    // Either works to round the area to 2 digits after the decimal.
    //area = Math.round(area * 100) / 100.0;
    //System.out.println("Its surface area is " + area);

    // This works as well.
    System.out.printf("Its surface area is %.2f\n", area);
  }
}

