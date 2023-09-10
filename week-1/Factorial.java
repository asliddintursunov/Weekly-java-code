import java.util.Scanner;

public class Factorial {
  public static int findFactorial(int number) {
    if (number == 0)
      return 1;
    return findFactorial(number - 1) * number;
  }

  public static void Task_4() {
    System.out.print("Input a number for its factorial! ");
    Scanner scanner = new Scanner(System.in);
    int factorialNumber = scanner.nextInt();
    scanner.close();
    System.out.println(factorialNumber + "! = " + findFactorial(factorialNumber));
  }

  public static void main(String[] args) {
    Task_4();
  }
}
