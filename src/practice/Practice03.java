package practice;

import java.util.Scanner;

public class Practice03 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("금액을 입력하시오.");
    int money = scanner.nextInt();
    int m50000 = (money / 50000);
    money = money % 50000;
    int m10000 = money / 10000;
    money = money % 10000;
    int m5000 = (money / 5000);
    money = money % 5000;
    int m1000 = (money / 1000);
    money = money % 1000;
    int m500 = (money / 500);
    money = money % 500;
    int m100 = (money / 100);
    money = money % 100;
    int m50 = (money / 50);
    money = money % 50;
    int m10 = (money / 10);
    money = money % 10;
    int m1 = money / 1;
    money = money % 1;
    System.out.println(
      "오만원권 : " +
      m50000 +
      " 매" +
      "\n" +
      " 만원권 : " +
      m10000 +
      " 매" +
      "\n" +
      " 오천원권 : " +
      m5000 +
      " 매" +
      "\n" +
      " 천원권 : " +
      m1000 +
      " 매" +
      "\n" +
      " 오백원 : " +
      m500 +
      " 개" +
      "\n" +
      " 백원 : " +
      m100 +
      " 개" +
      "\n" +
      " 오십원 : " +
      m50 +
      " 개" +
      "\n" +
      " 십원 : " +
      m10 +
      " 개" +
      "\n" +
      " 일원 : " +
      m1 +
      " 개"
    );
    scanner.close();
  }
}
