package HomeWork3;
import java.util.Scanner;
public class Lv1Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;


        while (true) {
            // 양의 정수(0)포함 입력받기.
            System.out.print("첫 번째 숫자를 입력하세요: ");
            double num1 = sc.nextDouble();

            System.out.print("두 번째 숫자를 입력하세요: ");
            double num2 = sc.nextDouble();

            // 사칙연산 기호 입력받기.
            System.out.print("사칙연산 기호를 입력하세요: ");
            String a = sc.next();


            // 연산 진행
            switch (a.charAt(0)) {
                case '+':
                    sum = num1 + num2;
                    if (sum % 1 == 0.0) {
                        System.out.println("결과는 " + (int) sum + "입니다!");
                        break;
                    } else {
                        System.out.println("결과는 " + sum + "입니다!");
                        break;
                    }
                case '-':
                    sum = num1 - num2;
                    if (sum % 1 == 0.0) {
                        System.out.println("결과는 " + (int) sum + "입니다!");
                        break;
                    } else {
                        System.out.println("결과는 " + sum + "입니다!");
                        break;
                    }
                case '/':
                    if (num2 == 0) {
                        System.out.println("나눗셈 연산에서 분모(두 번째 정수)가 0이 될 수 없습니다.");
                        break;
                    } else {
                        sum = num1 / num2;
                        if (sum % 1 == 0.0) {
                            System.out.println("결과는 " + (int) sum + "입니다!");
                            break;
                        } else {
                            System.out.println("결과는 " + sum + "입니다!");
                            break;
                        }
                    }
                case '*':
                    sum = num1 * num2;
                    if (sum % 1 == 0.0) {
                        System.out.println("결과는 " + (int) sum + "입니다!");
                        break;
                    } else {
                        System.out.println("결과는 " + sum + "입니다!");
                        break;
                    }
                default:
                    System.out.println("올바른 값을 넣어주세요!");
            }

            System.out.println("계속하려면 아무 키나 누르십시오 (\"exit\" 입력 시 종료)");
            String more = sc.next();

            if (more.equals("exit")) {
                System.out.println("계산을 종료합니다.");
                break;
            }
        }
    }
}

