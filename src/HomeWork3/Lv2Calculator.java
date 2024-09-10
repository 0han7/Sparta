package HomeWork3;

public class Lv2Calculator {

        public static void main(String[] args) {
            App cal = new App();

            //계산기 시작
            cal.start();
            //사칙연산 작동
            cal.calculate(cal.number1, cal.number2);
            //반복 작동
            cal.calculate2(cal.number3, cal.sign2);
        }
    }
