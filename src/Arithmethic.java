import java.util.Scanner;

public class Arithmethic {
    public static void main(String[] args) {
        System.out.println("정수를 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();
        int second = time%60;
        int minute = (time/60)%60;
        int hour = (time/60)/60;
        System.out.println(time+ "초는 " +hour+ "시간 " +minute+ "분 "+second+ "초입니다.");
        scanner.close();
    }
}
