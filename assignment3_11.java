import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    double radius;
    Scanner input = new Scanner(System.in);
    double x1, y1, x2, y2, x3, y3, x4, y4, x5, y5;

    // Find all the angles from the center of the circle
    // to the vertices of the pentagon
    // Starts with vertex on top at pi/2
    // incrementally adds 2pi/5 to find all 5 angles.
    double angle_increment = 2 * Math.PI / 5;
    double angle1 = Math.PI / 2;
    double angle2 = angle1 + angle_increment;
    double angle3 = angle1 + 2 * angle_increment;
    double angle4 = angle1 + 3 * angle_increment;
    double angle5 = angle1 + 4 * angle_increment;

    // Ask for radius
    System.out.println("Radius pls");
    radius = input.nextDouble();
   
    // Compute coordinates
    x1 = radius * Math.cos(angle1);
    y1 = radius * Math.sin(angle1);

    x2 = radius * Math.cos(angle2);
    y2 = radius * Math.sin(angle2);

    x3 = radius * Math.cos(angle3);
    y3 = radius * Math.sin(angle3);

    x4 = radius * Math.cos(angle4);
    y4 = radius * Math.sin(angle4);

    x5 = radius * Math.cos(angle5);
    y5 = radius * Math.sin(angle5);

    // Show coordinates.
    System.out.printf("Point 1: (%f, %f) \n", x1, y1);
    System.out.printf("Point 2: (%f, %f) \n", x2, y2);
    System.out.printf("Point 3: (%f, %f) \n", x3, y3);
    System.out.printf("Point 4: (%f, %f) \n", x4, y4);
    System.out.printf("Point 5: (%f, %f) \n", x5, y5);
  }
}

