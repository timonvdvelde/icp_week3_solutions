import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String text1, text2;

    // ask for two strings
    System.out.println("Enter a string:");
    text1 = input.nextLine();
    System.out.println("Enter another string:");
    text2 = input.nextLine();

    // check if it's a substring.
    if (text1.contains(text2)) {
      System.out.printf("%s is a substring of %s.\n", text2, text1);
    }
    else {
      System.out.printf("%s is not a substring of %s.\n", text2, text1);
    }
  }
}

