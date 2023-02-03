package practice;

import java.util.Scanner;

public class Practice04 {

  public static void main(String[] args) {
    //정수 3개를 입력받고 3개의 숫자 중 중간 크기의 수를 출력하라.
    Scanner scanner = new Scanner(System.in);
    System.out.println("정수 세개를 입력하면 중간값을 찾아드립니다.");
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    int center = a;
    if ((a >= b && a <= c) || (a >= c && a <= b)) {
      center = a;
    } else if ((b >= a && b <= c) || (b >= c && b <= a)) {
      center = b;
    } else if ((c >= a && c <= b) || (c >= a && c <= b)) {
      center = c;
    }
    System.out.println("중간값은 " + center + " 입니다.");
  }
}
