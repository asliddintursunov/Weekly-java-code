import java.util.Scanner;

public class isPrime {
  public static String isPrimeFunction(int number) {
    if (number >= 1) {

      if (number == 2) {
        return number + " is a Prime";
      }
      if (number % 2 == 0) {
        return number + " is not a Prime";
      }

      for (int i = 3; i * i <= number; i += 2) {
        if (number % i == 0) {
          return number + " is not a Prime";
        }
      }
      return number + " is a Prime";
    }
    return number + " is invalid input!";
  }

  public static void Task_1() {
    System.out.print("Please input a number: ");
    Scanner scanner = new Scanner(System.in);
    int isPrimeNumber = scanner.nextInt();
    System.out.println(isPrimeFunction(isPrimeNumber));
    scanner.close();
  }

  public static void main(String[] args) {
    Task_1();
  }
}