import java.util.Scanner;

public class Power {
  public static int FindPower(int base, int power) {
    return (int) Math.pow(base, power);
  }

  public static void Task_5() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input base number: ");
    int baseNumber = scanner.nextInt();

    System.out.print("Input power number: ");
    int powerNumber = scanner.nextInt();

    System.out.println(baseNumber + "^" + powerNumber + " = " + FindPower(baseNumber, powerNumber));
    scanner.close();
  }

  public static void main(String[] args) {
    Task_5();
  }
}
