package practice;

import java.util.Scanner;

/**
 * Q2 2자리 정수 (10~99사이)를 입력받고, 10의 자리와 1의 자리가 같은지 판별하여 출력하는 프로그램
 */
public class Practice02 {

  public static void main(String[] args) {
    System.out.println("2자리수 정수 입력(10~99)");
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    int ten = num / 10;
    int one = num % 10;
    if (ten == one) {
      System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
    } else {
      System.out.println("No, 10의 자리와 1의 자리가 같지 않습니다.");
    }
    scanner.close();
  }
}
