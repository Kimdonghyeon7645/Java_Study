public class note05 {
    public enum Language {
        JAVA,
        PYTHON,
        C,
        JAVA_SCRIPT,
        C_PIUS,
        C_SHARP
    }

    public static void main(String[] args) {
        Language i_love = Language.PYTHON;
        Language i_study = Language.JAVA;
        System.out.println("원래 저가 사랑하는 언어는 = " + i_love.name() + "입니다.");
        System.out.println("순서로는 " + i_love.ordinal() + "번째 언어입니다.");
        System.out.println(i_study.name() + "언어 보다, " + i_love.compareTo(i_study) + "번째 순서에 있는 언어입니다.");
        System.out.println("맨 처음에 시작한 언어는 = " + Language.valueOf("C"));
        System.out.println("제가 배웠던 언어는 아래와 같습니다.");
        for (Language lan : Language.values()) {
            System.out.println(lan + ",");
        }
    }
}
