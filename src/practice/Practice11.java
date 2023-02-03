package practice;

import java.util.Scanner;

//숫자를 입력받아 봄여름가을겨울 출력하기
public class Practice11 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("달을 입력하세요(1~12)");
    int month = scanner.nextInt();
    if ((month >= 3 && month <= 5)) {
      System.out.println("봄");
    } else if ((month >= 6 && month <= 8)) {
      System.out.println("여름");
    } else if ((month >= 9 && month <= 11)) {
      System.out.println("가을");
    } else if ((month == 12 || month == 1 || month == 2)) {
      System.out.println("겨울");
    } else {
      System.out.println("1~12의 정수를 입력해주세요.");
    }
    // String season;
    // switch (month / 10) {
    //   case 3:
    //   case 4:
    //   case 5:
    //     season = "봄";
    //     break;
    //   case 6:
    //   case 7:
    //   case 8:
    //     season = "여름";
    //     break;
    //   case 9:
    //   case 10:
    //   case 11:
    //     season = "가을";
    //     break;
    //   case 12:
    //   case 1:
    //   case 2:
    //     season = "겨울";
    //   default:
    //     season = "1~12까지의 정수를 입력해주세요.";
    // }
    // System.out.println(season);
  }
}
