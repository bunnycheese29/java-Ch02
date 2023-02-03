package practice;

import java.util.Scanner;

/**
 * test
 */
public class Practice01 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("원화를 입력하세요(단위 원)");
    int won = scanner.nextInt();
    final double rate = 1100.0;
    double dollar = won / rate;
    System.out.println(won + "원은 $" + dollar + "입니다.");

    scanner.close();
  }
}
