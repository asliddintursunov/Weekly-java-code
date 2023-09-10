import java.util.Scanner;

public class isEvenOrOdd {
  public static String isEvenOrOddNumber(int number) {
    return number % 2 == 0 ? number + " is Even!" : number + " is Odd!";
  }

  public static void Task_3() {
    System.out.print("Input a number: ");
    Scanner scanner = new Scanner(System.in);
    int inputNumber = scanner.nextInt();
    scanner.close();
    System.out.println(isEvenOrOddNumber(inputNumber));
  }

  public static void main(String[] args) {
    Task_3();
  }
}
