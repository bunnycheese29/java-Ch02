package practice;

import java.util.Scanner;

//사칙연산을 입력받아 계산하는 프로그램 (+ - * /)
public class Practice12 {

  public static void main(String[] args) {
    System.out.println("연산 (빈 칸으로 분리하여 입력)");
    Scanner scanner = new Scanner(System.in);
    double x = scanner.nextDouble();
    String op = scanner.next();
    double y = scanner.nextDouble();
    if (op.equals("+")) {
      double sum = x + y;
      System.out.println(x + op + y + "의 계산 결과는 " + sum);
    } else if (op.equals("-")) {
      double sub = x - y;
      System.out.println(x + op + y + "의 계산 결과는 " + sub);
    } else if (op.equals("*")) {
      double times = x * y;
      System.out.println(x + op + y + "의 계산 결과는 " + times);
    } else if (op.equals("/")) {
      double div = x / y;
      System.out.println(x + op + y + "의 계산 결과는 " + div);
    } else {
      System.out.println("다시 입력해주세요. (ex: 2 + 5)");
    }

    switch (op) {
      case "+":
        System.out.println("계산 결과는" + (x + y));
        break;
      case "-":
        System.out.println("계산 결과는" + (x - y));
        break;
      case "*":
        System.out.println("계산 결과는" + (x * y));
        break;
      case "/":
        System.out.println("계산 결과는" + (x / y));
        break;
      default:
        System.out.println("다시 입력해주세요. (ex: 2 + 5)");
    }
  }
}
