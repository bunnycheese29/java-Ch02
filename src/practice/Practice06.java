package practice;

import java.util.Scanner;

public class Practice06 {

  public static void main(String[] args) {
    //1~99까지의 정수를 입력받고 369게임을 만들어보자 13은 박수짝, 33은 박수짝짝
    Scanner scanner = new Scanner(System.in);
    System.out.println("1~99 사이의 정수를 입력하시오.");
    int num = scanner.nextInt();
    int ten = num / 10;
    int one = num % 10;
    int clap = 0;
    if (ten == 3 || ten == 6 || ten == 9) clap++;
    if (one % 3 == 0) clap++;
    if (clap == 2) {
      System.out.println("박수짝짝");
    } else if (clap == 1) {
      System.out.println("박수짝");
    } else {
      System.out.println("박수없음");
    }
    scanner.close();
  }
}
