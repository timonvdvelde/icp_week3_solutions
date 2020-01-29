import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String byteVal;
    int intVal;
    char bit1, bit2, bit3, bit4;

    // Ask for 4 digit binary number
    System.out.println("byte");
    byteVal = input.nextLine();
    bit1 = byteVal.charAt(0);
    bit2 = byteVal.charAt(1);
    bit3 = byteVal.charAt(2);
    bit4 = byteVal.charAt(3);

    // set integer value to 0
    intVal = 0;

    // increase intVal based on bits
    if (bit4 == '1') {
      intVal += 1;
    }
    if (bit3 == '1') {
      // 2^1 = 2
      intVal += 2;
    }
    if (bit2 == '1') {
      // 2^2 = 4
      intVal += 4;
    }
    if (bit1 == '1') {
      // 2^3 = 8
      intVal += 8;
    }

    // output
    System.out.println(intVal);
  }
}
