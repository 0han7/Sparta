package HomeWork3;

import java.util.Scanner;
import java.util.ArrayList;

public class App {
    double sum;
    int number1;
    int number2;
    int number3;
    String sign;
    String sign2;
    String sign3;
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> intList = new ArrayList<Integer>();


    //초기 값을 임력하는 메소드
    public void start() {
        System.out.print("첫 번째 정수를 입력하세요: ");
        number1 = sc.nextInt();
        System.out.print("두 번째 정수를 입력하세요: ");
        number2 = sc.nextInt();

        System.out.print("사칙연산 기호를 입력하세요: ");
        sign = sc.next();
    }


    //연산 기능
    public double calculate(int num1, int num2) {
        switch (sign.charAt(0)) {
            case '+':
                sum = num1 + num2;
                if (sum % 1 == 0.0) {
                    System.out.println("결과는 " + (int) sum + "입니다!");
                    break;}
                    else {
                System.out.println("결과는 " + sum + "입니다!");
                break;}

            case '-':
                sum = num1 - num2;
                if (sum % 1 == 0.0) {
                    System.out.println("결과는 " + (int) sum + "입니다!");
                    break;}
                else {
                    System.out.println("결과는 " + sum + "입니다!");
                    break;}
            case '*':
                sum = num1 * num2;
                if (sum % 1 == 0.0) {
                    System.out.println("결과는 " + (int) sum + "입니다!");
                    break;}
                else {
                    System.out.println("결과는 " + sum + "입니다!");
                    break;}
            case '/':
                if (num2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두 번째 정수)가 0이 될 수 없습니다.");
                    break;
                } else {
                    sum = num1 / num2;
                    if (sum % 1 == 0.0) {
                        System.out.println("결과는 " + (int) sum + "입니다!");
                        break;}
                    else {
                        System.out.println("결과는 " + sum + "입니다!");
                        break;}
                }

            default:
                System.out.println("올바른 값을 넣어주세요!");
        }
        intList.add((int) sum); //결과값 저장
        return sum;
    }

    //반복 연산 기능
    public double calculate2(int number3, String sign2) {
        while (true) {

            System.out.println("더 계산하시겠습니까? (\"exit\" 입력 시 종료)");
            System.out.println("초기 계산값을 삭제하겠습니까? (\"remove\" 입력 시 이동)");
            sign2 = sc.next(); //사칙연산 기호 입력 or exit 입력

            if (sign2.equals("exit")) {
                System.out.println("계산을 종료합니다.");
                break;
            }
            //초기 계산값 삭제 기능 추가
            else if (sign2.equals("remove")) {
                System.out.print("초기 계산값 " + intList.get(0) + "을 삭제하고 싶습니까? (yes or no): ");
                sign3 = sc.next();
                if (sign3.equalsIgnoreCase("Yes")) {
                    System.out.println("삭제되었습니다.");
                    intList.remove(0);
                    continue;
                }
            } else
                System.out.print("숫자를 입력하세요: ");
            number3 = sc.nextInt();

            switch (sign2.charAt(0)) {
                case '+':
                    sum = sum + number3;
                    if (sum % 1 == 0.0) {
                        System.out.println("결과는 " + (int) sum + "입니다!");
                        break;}
                    else {
                        System.out.println("결과는 " + sum + "입니다!");
                        break;}
                case '-':
                    sum = sum - number3;
                    if (sum % 1 == 0.0) {
                        System.out.println("결과는 " + (int) sum + "입니다!");
                        break;}
                    else {
                        System.out.println("결과는 " + sum + "입니다!");
                        break;}
                case '/':
                    if (number3 == 0) {
                        System.out.println("나눗셈 연산에서 분모(두 번째 정수)가 0이 될 수 없습니다.");
                        break;
                    } else {
                        sum = sum / number3;
                        if (sum % 1 == 0.0) {
                            System.out.println("결과는 " + (int) sum + "입니다!");
                            break;}
                        else {
                            System.out.println("결과는 " + sum + "입니다!");
                            break;}
                    }
                case '*':
                    sum = sum * number3;
                    if (sum % 1 == 0.0) {
                        System.out.println("결과는 " + (int) sum + "입니다!");
                        break;}
                    else {
                        System.out.println("결과는 " + sum + "입니다!");
                        break;}
                default:
                    System.out.println("올바른 값을 넣어주세요!");
            }
        }
        intList.add((int) sum); //결과값 저장
        return sum;
    }
}