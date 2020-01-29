import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String line;
    char letter, letterLower;

    // input
    System.out.println("Insert letter.");
    line = input.next();
    letter = line.charAt(0);
    // convert letter to lowercase to make checking easier later.
    letterLower = Character.toLowerCase(letter);

    // check of character is a letter
    if (!Character.isLetter(letter)) {
      System.out.println("Invalid");
    }
    // check if the letter is a vowel
    else if (letterLower == 'a' || letterLower == 'e' || letterLower == 'i' || letterLower == 'o' || letterLower == 'u') {
      System.out.printf("The letter %s is a vowel\n", letter);
    }
    // else it's a consonant
    else {
      System.out.printf("The letter %s is a consonant\n", letter);
    }
  }
}
