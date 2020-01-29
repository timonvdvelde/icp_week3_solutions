import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String name1, name2, name3;
    char ch1, ch2, ch3;

    // input
    System.out.println("Enter student 1: ");
    name1 = input.nextLine();
    ch1 = name1.charAt(0);
    System.out.println("Enter student 2: ");
    name2 = input.nextLine();
    ch2 = name2.charAt(0);
    System.out.println("Enter student 3: ");
    name3 = input.nextLine();
    ch3 = name3.charAt(0);

    // ch1 is smallest.
    if (ch1 <= ch2 && ch1 <= ch3) {
      if (ch2 <= ch3) {
        // 1, 2, 3
        System.out.printf("Names sorted alphabetically: %s %s %s\n", name1, name2, name3);
      }
      else {
        // 1, 3, 2
        System.out.printf("Names sorted alphabetically: %s %s %s\n", name1, name3, name2);
      }
    }
    // ch2 is smallest.
    else if (ch2 <= ch1 && ch2 <= ch3) {
      if (ch1 <= ch3) {
        // 2, 1, 3
        System.out.printf("Names sorted alphabetically: %s %s %s\n", name2, name1, name3);
      }
      else {
        // 2, 3, 1
        System.out.printf("Names sorted alphabetically: %s %s %s\n", name2, name3, name1);
      }
    }
    // ch3 is smallest.
    else {
      if (ch1 <= ch2) {
        // 3, 1, 2
        System.out.printf("Names sorted alphabetically: %s %s %s\n", name3, name1, name2);
      }
      else {
        // 3, 2, 1
        System.out.printf("Names sorted alphabetically: %s %s %s\n", name3, name2, name1);
      }
    }
  }
}

