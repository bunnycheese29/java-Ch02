public class Logical {

  public static void main(String[] args) {
    //논리연산자
    System.out.println(3 > 2);
    System.out.println(3 < 2);
    System.out.println(3 == 2); //false
    System.out.println(3 != 2); //true
    System.out.println(!(3 != 2)); //false
    System.out.println(3 > 2 || 3 > 4); //true
    System.out.println(3 > 2 && 3 > 4); //false
    System.out.println(3 > 2 ^ 3 > 4); //true (두 결과가 다르면 참)

    //삼항연산자
    int a = 5; //절대값 구하기
    int b = 10;
    int s = a > b ? 1 : -1;
    int s2 = a > b ? a - b : b - a;
    if (a > b) {
      s = a - b;
    } else {
      s = b - a;
    }
    System.out.println(s);
    System.out.println(s2);
  }
}
