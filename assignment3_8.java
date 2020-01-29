import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String money;
    String dollars, cents;
    int idx;

    // ask for monetary value
    System.out.println("Insert money.");
    money = input.nextLine();
   
    // split at .
    idx = money.indexOf('.');
    dollars = money.substring(0, idx);
    cents = money.substring(idx+1);

    // print result.
    System.out.printf("We are dealing with %s dollars and %s cents.\n", dollars, cents);
  }
}
