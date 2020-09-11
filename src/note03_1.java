public class note03_1 {
    public static void main(String[] args) {
        int i1 = +100;  // 양수 표시
        int i2 = -100;  // 음수 표시
        System.out.println("i1 = "+i1+",   +i1 = "+ +i1+", -i1 = "+ -i1);
        System.out.println("i2 = "+i2+",  +i2 = "+ +i2+", -i2 = "+ -i2);
        /*
        + 연산자 : 피연산자 부호 유지
        - 연산자 : 피연산자 부호 변경
        +, - 연산자의 반환 값은 int 타입
         */

        System.out.println("i1++ = "+ i1++);
        System.out.println("i1 = "+ i1);
        System.out.println("++i2 = "+ ++i1);
        System.out.println("i2 = "+ i1);
        /*
        ++ 연산자 : 피연산자 +1
        -- 연산자 : 피연산자 -1
        ++, --가 피연산자 앞에 붙으면 +1, -1이 연산 전에 수행 되고, 뒤에 붙으면 모든 연산이 끝난후 +1, -1이 수행 된다.
         */

        boolean b1 = true;
        System.out.println("b1 = "+ b1);
        System.out.println("!b1 = "+ !b1);
        /*
        ! 연산자 : 피연산자(boolean)가 true면 false로, false면 true로 변경
         */

        System.out.println("~i1 = "+ ~i1);
        /*
        ~ 연산자 : 정수타입(byte, short, int, long)이 2진수로 표현됬을 때 비트가 0과 1이 반전된다. (최상위 비트를 포함해서)
         */

        int n1 = 2 + 1;
        int n2 = 2 - 1;
        int n3 = 3 * 2;
        int n4 = 3 / 2;     // / 연산자는 나눗셈 후 정수 부분만 반환
        double n5 = 3 / 2;     // double 자료형으로 반환값을 받아도 정수 부분만 받음
        double n6 = 3.0 / 2;     // 피연산자 중 하나가 double 타입이여야 실수 부분도 반환
        System.out.println("2 + 1 = "+ n1);
        System.out.println("2 - 1 = "+ n2);
        System.out.println("3 * 2 = "+ n3);
        System.out.println("3 / 2 = "+ n4);
        System.out.println("3 / 2 = "+ n5);
        System.out.println("3 / 2 = "+ n6);
        /*
        +, -, /, * 연산자 : 사칙연산을 하는 연산자
         */

        // 5 / 0 또는 5 % 0       // ArithmeticException 예외 발생
        System.out.println(5 / 0.0);    // Infinity  (무한)
        System.out.println(5 % 0.0);    // NaN  (Not a Number)

        System.out.println(3 + 3);      // 피연산자 둘다 숫자면 산술 연산자(+)로 처리
        System.out.println(3 + "3");    // 피연산자 둘중 하나라도 문자열이면 문자열 연결 연산자(+)로 처리
        System.out.println(3 + "3" + 1.0);  // + 연산자는 왼쪽에서 오른쪽으로 부터 연산이 되기에, 경우에 따라 어떻게 +가 쓰이는지 중요
        System.out.println(3 + '3');  // 참고로 피연산자가 문자면, 문자가 숫자로 변환 되여서 처리

        System.out.println(3 > 2);
        System.out.println(3 >= 2);
        System.out.println(3 == 2);
        System.out.println(3 != 2);
        System.out.println(3 <= 2);
        System.out.println(3 < 2);
        /*
        >, <, >=, <=, ==, != : 비교연산자, boolean 값을 반환
         */

        String str1 = "자바";
        String str2 = "자바";
        String str3 = new String("자바");
        System.out.println(str1 == str2);   // 자바에서 변수에 대입되는 문자열 리터럴이 동일하다면 동일한 String 객체를 참조함.
        System.out.println(str1 == str3);   // 하지만 new를 사용해서 새로운 String 객체를 생성하면,
                                            // 둘의 저장된 위치가 달라서 false가 나옴 (== 연산자는 변수에 저장된 값만 비교)

        System.out.println(true && false);  // && 대신 & 도 가능
        System.out.println(true || false);  // || 대신 | 도 가능
        System.out.println(true ^ false);
        System.out.println(!true);
        /*
        && (또는 &) 연산자 : 논리곱(AND)
        || (또는 |) 연산자 : 논리합(OR)
        ^ 연산자 : 배타적논리합(XOR)
        ! 연산자 : 논리부정(NOT)
         */

        System.out.println(3 & 2);  // 11 & 10  논리곱(AND)
        System.out.println(3 | 2);  // 11 | 10  논리합(OR)
        System.out.println(3 ^ 2);  // 11 ^ 10  배타적논리합(XOR)
        System.out.println(~3);     // ~ 11     논리부정(NOT)
        /*
        피연산자가 boolean 이면 논리 연산, 정수타입이면 비트 단위로 논리 연산함.
         */


    }
}
