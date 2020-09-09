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
        * */

        System.out.println("i1++ = "+ i1++);
        System.out.println("i1 = "+ i1);
        System.out.println("++i2 = "+ ++i1);
        System.out.println("i2 = "+ i1);
        /*
        ++ 연산자 : 피연산자 +1
        -- 연산자 : 피연산자 -1
        ++, --가 피연산자 앞에 붙으면 +1, -1이 연산 전에 수행 되고, 뒤에 붙으면 모든 연산이 끝난후 +1, -1이 수행 된다.
        * */

        boolean b1 = true;
        System.out.println("b1 = "+ b1);
        System.out.println("!b1 = "+ !b1);
        /*
        ! 연산자 : 피연산자(boolean)가 true면 false로, false면 true로 변경
        * */

        System.out.println("~i1 = "+ ~i1);
        /*
        ~ 연산자 : 정수타입(byte, short, int, long)이 2진수로 표현됬을 때 비트가 0과 1이 반전된다. (최상위 비트를 포함해서)
        * */

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
        * */


    }
}
