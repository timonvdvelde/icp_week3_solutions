import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String line;
    char letter;
    int grade;

    // input
    System.out.print("Please insert grade (A, B, C, D, E, F): ");
    line = input.next();
    letter = line.charAt(0);

    // grade conversion
    if (letter == 'A') {
      grade = 10;
    }
    else if (letter == 'B') {
      grade = 9;
    }
    else if (letter == 'C') {
      grade = 8;
    }
    else if (letter == 'D') {
      grade = 7;
    }
    else if (letter == 'E') {
      grade = 6;
    }
    else if (letter == 'F') {
      grade = 5;
    }
    else {
      System.out.println("Invalid input");
      return;
    }

    System.out.printf("Your grade is %d.\n", grade);
  }
}
