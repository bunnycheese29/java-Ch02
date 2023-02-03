package practice;

import java.util.Scanner;

//(100, 100)과 (200, 200)의 두 점으로 이루어진 사각형이 있을 때, 정수 x와 y값을 입력받고 점 (x, y)가
//이 직사각형 안에 있는지를 판별하는 프로그램
public class Practice07 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("점 (x,y)의 좌표를 입력하시오.");
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    if ((x >= 100 && x <= 200) && (y >= 100 && y <= 200)) {
      System.out.println("(" + x + "," + y + ")" + "는 사각형 안에 있습니다.");
    } else {
      System.out.println("(" + x + "," + y + ")" + "는 사각형 안에 없습니다.");
    }
    scanner.close();
  }
}
