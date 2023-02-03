//카푸치노 3500, 에스프레소 3200, 카페라떼 4000, 아메리카노 2000, 메뉴에 없음

import java.util.Scanner;

public class Coffee {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("무슨 커피 주문하시겠습니까?");
    String order = scanner.next();
    int price = 0;
    switch (order) {
      case "카푸치노":
        price = 3500;
        break;
      case "에스프레소":
        price = 3200;
        break;
      case "카페라떼":
        price = 4000;
        break;
      case "아메리카노":
        price = 2000;
        break;
      default:
        System.out.println("메뉴에 없는 커피입니다.");
    }
    if (price > 0) System.out.println(
      "주문하신 " + order + "의 가격은 " + price + "원 입니다."
    );
    scanner.close();
  }
}
