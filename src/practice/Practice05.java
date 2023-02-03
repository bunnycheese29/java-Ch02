package practice;

import java.util.Scanner;

public class Practice05 {

  public static void main(String[] args) {
    //입력받은 세개의 정수가 삼각형을 이룰 수 있는지
    //삼각형이 되려면 두 변의 합이 다른 한 변의 합보다 커야 한다.
    System.out.println("정수 3개를 입력하시오.");
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();

    if (a + b > c && a + c > b && b + c > a) {
      System.out.println("삼각형이 됩니다.");
    } else {
      System.out.println("삼각형이 되지 않습니다.");
    }
  }
}
