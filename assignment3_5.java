import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String text;
    int length;
    
    System.out.println("Enter some text");
    text = input.nextLine();
    length = text.length();

    // Do spaces at the end of the string matter?
    System.out.println("The length of the String is: " + length);
    System.out.println("The last character is: " + text.charAt(length - 1));
  }
}

