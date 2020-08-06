/* 자바 02-1-변수, 02-2-데이터 타입 */
public class note02_1 {
    public static void main(String[] args) {
        // 변수의 선언
        int age;
        double weight;
        // 변수의 사용 - 저장
        age = 18;
        weight = 68.5;
        // 변수의 사용 - 읽기
        System.out.println(age);
        System.out.println(weight);

        byte b = 127;
        char c = '하';
        short s = 32767;
        int i = 2147483647;
        long l = 9223372036854775807L;
        float f = 0.111111111111111f;
        double d = 0.111111111111111;
        boolean bo = true;
        System.out.println(b);
        System.out.println(c);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(i + 1);  // 오버 플로우
        System.out.println(l + 1);  // 오버 플로우
        // byte 와 short 에 +1을 안하는 이유는, +1을 하면 강제 타입 변환(int)이 되서 오버 플로우가 발생하지 않기 때문
        System.out.println(f);
        System.out.println(d);
        System.out.println(bo);
    }
}
