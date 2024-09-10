package HomeWork3;
import java.util.Scanner;
public class Lv1Calculator {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            // 양의 정수(0)포함 입력받기.
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            // 사칙연산 기호 입력받기.
            System.out.print("사칙연산 기호를 입력하세요: ");
            String a = sc.next();


            // 연산 진행
            int sum = 0;

            switch (a.charAt(0)) {
                case '+':
                    sum = num1 + num2;
                    System.out.println("결과: " + sum + "입니다!");
                    break;
                case '-':
                    sum = num1 - num2;
                    System.out.println("결과: " + sum + "입니다!");
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("나눗셈 연산에서 분모(두 번째 정수)가 0이 될 수 없습니다.");
                        break;
                    } else {
                        sum = num1 / num2;
                        System.out.println("결과: " + sum + "입니다!");
                        break;
                    }
                case '*':
                    sum = num1 * num2;
                    System.out.println("결과: " + sum + "입니다!");
                    break;
                default:
                    System.out.println("올바른 값을 넣어주세요!");
            }



            while (true) {

                System.out.println("사칙연산 기호를 입력하세요 (\"exit\" 입력 시 종료)");
                String more = sc.next();

                if (more.equals("exit")) {
                    System.out.println("계산을 종료합니다.");
                    break;
                } else {
                    System.out.print("숫자를 입력하세요: ");
                }
                int num3 = sc.nextInt();

                switch (more.charAt(0)) {
                    case '+':
                        sum = sum + num3;
                        System.out.println("결과: " + sum + "입니다!");
                        break;
                    case '-':
                        sum = sum - num3;
                        System.out.println("결과: " + sum + "입니다!");
                        break;
                    case '/':
                        if (num2 == 0) {
                            System.out.println("나눗셈 연산에서 분모(두 번째 정수)가 0이 될 수 없습니다.");
                            break;
                        } else {
                            sum = sum / num3;
                            System.out.println("결과: " + sum + "입니다!");
                            break;
                        }
                    case '*':
                        sum = sum * num3;
                        System.out.println("결과: " + sum + "입니다!");
                        break;
                    default:
                        System.out.println("올바른 값을 넣어주세요!");
                }

            }

        }
}

