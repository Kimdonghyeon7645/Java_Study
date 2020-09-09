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
    }
}
