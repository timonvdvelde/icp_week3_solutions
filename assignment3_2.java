import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Get input
    System.out.println("How many sides does your figure have?");
    int n = input.nextInt();
    System.out.println("What is the radius?");
    double radius = input.nextDouble();

    // Calculate area.
    double s = 2 * radius * Math.sin(Math.PI / n);
    double area = (n * s * s) / (4 * Math.tan(Math.PI / n));

    // Output
    System.out.printf("Its surface area is %.2f\n", area);
  }
}

