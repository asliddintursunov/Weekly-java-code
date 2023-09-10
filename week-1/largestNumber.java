import java.util.Scanner;

public class largestNumber {
  public static int LargestNumber(int num1, int num2, int num3) {
    if (num1 > num2 && num1 > num3)
      return num1;
    else if (num2 > num1 && num2 > num3)
      return num2;
    else
      return num3;
  }

  public static void Task_2() {
    System.out.println("Please input 3 random numbers: ");

    System.out.print("Number 1: ");
    Scanner scanner = new Scanner(System.in);
    int firstNumber = scanner.nextInt();

    System.out.print("Number 2: ");
    int seconodNumber = scanner.nextInt();

    System.out.print("Number 3: ");
    int thirdNumber = scanner.nextInt();

    int largest = LargestNumber(firstNumber, seconodNumber, thirdNumber);
    System.out.println("Largest number is " + largest);
    scanner.close();
  }

  public static void main(String[] args) {
    Task_2();
  }
}
